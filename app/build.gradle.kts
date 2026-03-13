plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.dnyfetch.codeeditor"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dnyfetch.codeeditor"
        minSdk = 21
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    implementation("io.github.Rosemoe.sora-editor:editor:0.23.0")
    implementation("io.github.Rosemoe.sora-editor:language-java:0.23.0")
    implementation("io.github.Rosemoe.sora-editor:language-python:0.23.0")
    implementation("io.github.Rosemoe.sora-editor:language-javascript:0.23.0")

    implementation("commons-io:commons-io:2.15.1")
}
