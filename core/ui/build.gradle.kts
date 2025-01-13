plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.micheldr.core.ui"
    compileSdk = 35
}
dependencies {
    implementation(libs.androidx.runtime.android)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.material3.android)
}
