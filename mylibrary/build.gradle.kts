
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose) // ✅ Required for Kotlin 2.0+
    id("maven-publish")
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "com.cex.mylibrary"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.12" // ✅ Make sure this matches Compose version (not Kotlin)
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
    // Compose BOM (manages all Compose versions)
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))

    // Material3 (includes Button, ButtonDefaults, ButtonColors)
    implementation("androidx.compose.material3:material3")

    // Compose UI (for Dp, Modifier, etc.)
    implementation("androidx.compose.ui:ui")

    // Required for Dp, PaddingValues, TextStyle, etc.
    implementation("androidx.compose.ui:ui-unit")
    implementation("androidx.compose.ui:ui-text")

    // Optional: Icons and Tooling
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")
    debugImplementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.compose.ui:ui-tooling-preview")

}
