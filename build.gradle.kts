plugins {
    id("org.jetbrains.kotlin.jvm")
}

// Bu modülde Android bağımlılığı YOK: yalnızca Kotlin standart kütüphanesi.
// Böylece birim testleri emülatörsüz, düz JVM'de çalışır (gradle :core:test).

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "17"
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}
