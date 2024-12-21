plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.jetbrainsKotlinKsp)
    alias(libs.plugins.hiltPlugin)
}

android {
    namespace = "com.utad.rvwithmvvc"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.utad.rvwithmvvc"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    // glide
    implementation("com.github.bumptech.glide:glide:4.16.0")


    //view model
    implementation(libs.androidx.lifecycle.viewmodel.ktx)

    // Livedata
    implementation(libs.androidx.lifecycle.livedata.ktx)

    //framgents
    implementation(libs.androidx.fragment)

    //retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    // DaggerHilt
    implementation (libs.hilt.android)
    ksp(libs.dagger.compiler)
    ksp(libs.hilt.compiler)

    // corutines
    implementation(libs.kotlinx.coroutines.androd)

    //Room
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}