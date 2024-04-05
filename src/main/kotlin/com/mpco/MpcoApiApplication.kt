package com.mpco

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MpcoApiApplication

fun main(args: Array<String>) {
    runApplication<MpcoApiApplication>(*args)
}
