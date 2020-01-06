package com.spring.boot.e2e.Spring.Boot.E2E

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootE2EApplication

fun main(args: Array<String>) {
	runApplication<SpringBootE2EApplication>(*args)
}
