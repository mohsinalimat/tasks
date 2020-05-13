buildscript {
    repositories {
        jcenter()
        google()
        maven("https://maven.fabric.io/public")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:3.6.3")
        classpath("com.google.gms:google-services:4.3.3")
        // https://docs.fabric.io/android/changelog.html#fabric-gradle-plugin
        classpath("io.fabric.tools:gradle:1.31.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("com.dicedmelon.gradle:jacoco-android:0.1.4")
    }
}

tasks.getByName<Wrapper>("wrapper") {
    gradleVersion = "5.6.4"
    distributionType = Wrapper.DistributionType.ALL
}
