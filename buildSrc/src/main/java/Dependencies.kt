object ApplicationId {
    const val id = "com.napas.tamboon"
}

object Modules {
    const val app = ":app"
    const val data = ":data"
    const val domain = ":domain"
    const val navigation = ":navigation"
    const val commonUi = ":common-ui"
    const val commonRes = ":common-res"
    const val commonTest = ":common-test"
    const val featureCharityList = ":features:charitylist"
    const val featureDonation = ":features:donation"
}

object Releases {
    const val versionName = "1.0.0"
    const val versionCode = 1
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 30
}

object Versions {
    const val androidGradle = "4.1.2"
    const val kotlin = "1.4.21"
    const val google = "4.3.3"
    const val material = "1.2.0"
    const val coroutines = "1.4.2"
    const val okhttp = "4.9.0"
    const val retrofit = "2.9.0"
    const val koin = "2.2.2"
    const val navigation = "2.3.2"
    const val fragment = "1.2.5"
    const val lifecycle = "2.2.0"
    const val appcompat = "1.2.0"
    const val recyclerview = "1.1.0"
    const val constraintLayout = "2.0.4"
    const val coreKtx = "1.3.2"
    const val coil = "1.1.1"
    const val junit = "1.1.0"
    const val mockK = "1.9.3"
    const val test = "1.2.0"
    const val archCore = "2.1.0"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val koinGradlePlugin = "org.koin:koin-gradle-plugin:${Versions.koin}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinExtensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"

    // di
    const val koin = "org.koin:koin-android:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"

    // navigation
    const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationSafeArgsGradlePlugin =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"

    // ui
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val fragment = "androidx.fragment:fragment:${Versions.fragment}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val coilGif = "io.coil-kt:coil-gif:${Versions.coil}"

    // data
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // log
    const val okhttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
}

object TestDeps {
    const val testCore = "androidx.test:core:${Versions.test}"
    const val testRunner = "androidx.test:runner:${Versions.test}"
    const val testRules = "androidx.test:rules:${Versions.test}"
    const val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCore}"
    const val coroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    const val junit = "androidx.test.ext:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockK}"
    const val mockkAndroid = "io.mockk:mockk-android:${Versions.mockK}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"
    const val koin = "org.koin:koin-test:${Versions.koin}"
}