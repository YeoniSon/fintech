package com.zerobase.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EntityScan(basePackages = ["com.zerobase.domain.domain"])
@ComponentScan(basePackages = ["com.zerobase"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}