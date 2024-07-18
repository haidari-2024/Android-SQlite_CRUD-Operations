plugins {
    alias(libs.plugins.androidApplication)
  //  alias(libs.plugins.kotlinAndroid) // اگر از Kotlin استفاده می‌کنید
}

android {
    namespace = "com.example.sqlite_curd_operations"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.sqlite_curd_operations"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Optional: Enable Jetifier if needed
    // buildFeatures {
    //     viewBinding = true
    // }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
