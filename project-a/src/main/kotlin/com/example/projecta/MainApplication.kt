package com.example.projecta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
    val context = runApplication<MainApplication>(*args)
    val strategyContext = context.getBean(StrategyContext::class.java)
    println(strategyContext.execute())
}
