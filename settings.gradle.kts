pluginManagement {
    repositories {
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
//        mavenCentral()
//        gradlePluginPortal()
        maven(url = "https://artifactory.corp.ebay.com/artifactory/android/" )
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        google()
//        mavenCentral()
        maven(url = "https://artifactory.corp.ebay.com/artifactory/android/" )
    }
}

rootProject.name = "Meeta"
include(":app")
