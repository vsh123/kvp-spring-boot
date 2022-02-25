import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.3" apply false
	id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false

	kotlin("plugin.spring") apply false
	kotlin("plugin.jpa") apply false
	kotlin("jvm")
	kotlin("kapt")
}

allprojects {
	repositories {
		mavenCentral()
	}
}

subprojects {
	apply(plugin = "java")
	apply(plugin = "kotlin")
	apply(plugin = "io.spring.dependency-management")
	apply(plugin = "kotlin-jpa")
	apply(plugin = "kotlin-kapt")

	group = "kvp.van"
	version = "0.0.1-SNAPSHOT"
	java.sourceCompatibility = JavaVersion.VERSION_1_8

	dependencies {
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	}

	tasks {
		compileKotlin {
			kotlinOptions {
				freeCompilerArgs = listOf("-Xjsr305=strict")
				jvmTarget = "1.8"
			}
			dependsOn(processResources) // kotlin 에서 ConfigurationProperties
		}


		compileTestKotlin {
			kotlinOptions {
				freeCompilerArgs = listOf("-Xjsr305=strict")
				jvmTarget = "1.8"
			}
		}
	}
}
