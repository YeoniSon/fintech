plugins {
    kotlin("plugin.spring") version "1.6.0"
}

version = "0.0.1"


dependencies {

    implementation(project(":domain"))

    //spring-boot-starter-web
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")

    //swagger
//    implementation("io.springfox:springfox-boot-starter:3.0.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.9")
}