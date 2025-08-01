plugins {
    kotlin("plugin.spring") version "1.6.0"
}

version = "0.0.1"


dependencies {
    //dependence
    implementation(project(":domain"))
    implementation(project(":kafka"))

    //spring-boot-starter-web
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")

    //swagger
//    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.9")

    //for test
    implementation("io.mockk:mockk:1.12.0")
    runtimeOnly("com.h2database:h2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.+")

    // AOP
    implementation("org.springframework.boot:spring-boot-starter-aop")

    // Logging
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.4")

    // Redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}