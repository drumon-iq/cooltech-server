package br.com.cooltech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CooltechApplication

fun main(args: Array<String>) {
	runApplication<CooltechApplication>(*args)
}
