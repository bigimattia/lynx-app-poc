plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.bigimattia.lynx_app_poc"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.bigimattia.lynx_app_poc"
        minSdk = 33
        targetSdk = 35
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.foundation.android)
    implementation(libs.androidx.material3.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // lynx dependencies
    implementation("org.lynxsdk.lynx:lynx:3.2.0")
    implementation("org.lynxsdk.lynx:lynx-jssdk:3.2.0")
    implementation("org.lynxsdk.lynx:lynx-trace:3.2.0")
    implementation("org.lynxsdk.lynx:primjs:2.12.0")

    // integrating image-service
    implementation("org.lynxsdk.lynx:lynx-service-image:3.2.0")

    // image-service dependencies, if not added, images cannot be loaded; if the host APP needs to use other image libraries, you can customize the image-service and remove this dependency
    implementation("com.facebook.fresco:fresco:2.3.0")
    implementation("com.facebook.fresco:animated-gif:2.3.0")
    implementation("com.facebook.fresco:animated-webp:2.3.0")
    implementation("com.facebook.fresco:webpsupport:2.3.0")
    implementation("com.facebook.fresco:animated-base:2.3.0")

    // integrating log-service
    implementation("org.lynxsdk.lynx:lynx-service-log:3.2.0")

    // integrating http-service
    implementation("org.lynxsdk.lynx:lynx-service-http:3.2.0")

    implementation("com.squareup.okhttp3:okhttp:4.9.0")
}