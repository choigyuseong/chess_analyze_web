plugins {
    id("org.springframework.boot") version "3.1.6"
    id("io.spring.dependency-management") version "1.1.3"
    id("java")
    id("com.diffplug.spotless") version "6.24.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot Starter
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // PostgreSQL JDBC Driver
    runtimeOnly("org.postgresql:postgresql")

    // JSON (LocalDateTime 직렬화 등)
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    // Lombok (선택)
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testCompileOnly("org.projectlombok:lombok")
    testAnnotationProcessor("org.projectlombok:lombok")

    // 테스트
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

spotless {
    java {
        googleJavaFormat()
    }
}
