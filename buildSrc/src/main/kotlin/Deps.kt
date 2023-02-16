object Deps {
    object Android {
        const val core = "androidx.core:core:1.9.0"
        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
        const val material = "com.google.android.material:material:1.8.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"

        val list = listOf(core, appCompat, material, constraintLayout)
    }

    object UnitTesting {
        const val junit = "junit:junit:4.13.2"
        val list = listOf(junit)
    }

    object InstrumentationTest {
        const val junitExt = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"

        val list = listOf(junitExt, espresso)
    }
}