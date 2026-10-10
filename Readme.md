This repo has demonstrates the issue around generated code with Metro. for more
see https://github.com/ZacSweers/metro/discussions/2923

The main DI structure is
AppComponent
|
 MainActivitySubcomponent
 |
  MainViewModelSubcomponent


AppComponent:
- contains bindings that are commonly used

MainActivitySubcomponent:
- Used to inject MainActivity.
- MainActivity does inject TrackingHandler and DataSource that use multi-binding.
- No additional IntoSet or IntoMap in this subcomponent 

MainViewModelSubcomponent.
- Used to inject MainViewModel
- MainViewModel does inject TrackingHandler and DataSource that use multi-binding.
- includes IntoSet and IntoMap for classes that is used in DefaultTrackingHandler and DefaultDataSource


All three project uses the same DI structure: 
- :daggerDemo 
Generated Code, that hoist to parent component in MainActivitySubcomponentImpl for TrackingHandler and DataSource
https://github.com/raosangi/metroSamples/blob/main/daggerDemo/generated_output/daggerDemo-debug/sources/com/samples/dagger/demo/di/DaggerAppComponent.java

- :interopDaggerDemo
Generated Code, that does not hoist to parent component in MainActivitySubcomponentImpl for TrackingHandler and DataSource
https://github.com/raosangi/metroSamples/blob/main/interopDaggerDemo/generated_ouput/interopDaggerDemo-debug/sources/com/samples/interop/dagger/demo/di/AppComponent.java

- :metroDemo
Generated Code, that does not hoist to parent component in MainActivitySubcomponentImpl for TrackingHandler and DataSource
https://github.com/raosangi/metroSamples/blob/main/metroDemo/generated_output/metroDemo-debug/sources/com/samples/metro/demo/di/AppComponent.java

