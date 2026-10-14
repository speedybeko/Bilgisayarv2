plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.berkay.oyunceviri.tv"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.berkay.oyunceviri.tv"
        minSdk = 26
        targetSdk = 34
        versionCode = 2
        versionName = "0.2"
    }

    // Sabit debug anahtarı: yeni sürümler eskisinin üstüne kurulabilsin (yalnızca kişisel kullanım)
    signingConfigs {
        getByName("debug") {
            storeFile = rootProject.file("debug.keystore")
            storePassword = "android"
            keyAlias = "androiddebugkey"
            keyPassword = "android"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Ortak protokol sabitleri ve eşleştirme kodu (TokenAuth)
    implementation(project(":core"))
    // Hafif WebSocket sunucusu (TV tarafı)
    implementation("org.java-websocket:Java-WebSocket:1.5.7")
}
