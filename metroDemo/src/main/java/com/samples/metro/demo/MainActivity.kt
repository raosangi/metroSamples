package com.samples.metro.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.samples.metro.demo.di.AppComponentHolder
import com.samples.metro.demo.errors.ErrorHandler
import com.samples.metro.demo.network.DataSource
import com.samples.metro.demo.tracking.TrackingHandler
import com.samples.metro.demo.theme.MeetaTheme
import com.samples.metro.demo.viewmodel.MainViewModel
import com.samples.metro.demo.viewmodel.MainViewModelSubcomponent
import dev.zacsweers.metro.Inject
import kotlin.getValue

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var errorHandler: ErrorHandler

    @Inject
    lateinit var trackingHandler: TrackingHandler

    @Inject
    lateinit var dataSource: DataSource

    @Inject
    lateinit var mainViewModelSubcomponentFactory: MainViewModelSubcomponent.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppComponentHolder.appComponent.mainActivitySubComponentFactory.create().inject(this)

        errorHandler.handleError("main activity error")
        trackingHandler.handleTracking("mainActivity")
        dataSource.getData("App")

        val viewmodel : MainViewModel by viewModels {
            viewModelFactory {
                initializer {
                    mainViewModelSubcomponentFactory.create(createSavedStateHandle()).mainViewModel
                }
            }
        }

        enableEdgeToEdge()
        setContent {
            MeetaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LaunchedEffect(viewmodel) {
                        viewmodel.track()
                    }
                    Greeting(
                        name = viewmodel.message,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MeetaTheme {
        Greeting("Android")
    }
}
