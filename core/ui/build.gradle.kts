plugins {
    id("fiki.android.library")
    id("fiki.android.library.compose")
    id("fiki.android.library.jacoco")
}

android {
    namespace = "com.saeed.fiki.core.ui"
}

dependencies {
    implementation(project(":core:designsystem"))
}
