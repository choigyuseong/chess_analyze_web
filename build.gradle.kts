plugins {
    id("io.spring.dependency-management") version "1.1.3" apply false
    id("com.diffplug.spotless") version "6.24.0" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }

    plugins.withType<JavaPlugin> {
        extensions.configure<JavaPluginExtension> {
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }
    }
}

tasks.register<Exec>("runPythonAnalyzer") {
    workingDir = file("python-analyzer")
    commandLine("/home/gyu/personal_project/chess_analyze_web/python-analyzer/venv/bin/python",
        "src/analyzer.py")
}
