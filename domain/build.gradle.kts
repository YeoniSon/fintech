plugins {
    kotlin("plugin.jpa") version "1.6.0"
}

version = "0.0.1"


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")
    implementation("mysql:mysql-connector-java")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
}
