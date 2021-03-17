# Tamboon
A sample of Android app showing clean architecture + modularization. 
This app includes 3 screens:
- Charity list
- Donation
- Donation complete

API: https://app.swaggerhub.com/apis/chakritw/tamboon-api/1.0.0

## Summary
- Overall Architecture: MVVM + Clean Architecture + Modularization
- Entirely written in [Kotlin](https://kotlinlang.org)
- Use many of the [Android Jetpack](https://developer.android.com/jetpack)
  - [Data Binding](https://developer.android.com/topic/libraries/data-binding): Declaratively bind observable data to UI elements
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata): Notify views when underlying datasource changes
  - [Navigation](https://developer.android.com/guide/navigation/): Handle everything needed for in-app navigation
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel): Manage UI-related data in a lifecycle-conscious way
  - [Android KTX](https://developer.android.com/kotlin/ktx): Write more concise, idiomatic Kotlin code
- Use [Koin](https://github.com/InsertKoinIO/koin) for dependency injection
- Use [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) for managing background threads with simplified code and reducing needs for callbacks
- Use [Coil](https://github.com/coil-kt/coil) for image loading
