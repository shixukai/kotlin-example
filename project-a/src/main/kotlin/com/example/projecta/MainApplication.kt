package com.example.projecta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.example.projecta", "com.example.projectb", "com.example.common"])
class MainApplication

fun main(args: Array<String>) {
    val context = runApplication<MainApplication>(*args)
    val strategyContext = context.getBean(StrategyContext::class.java)
    println(strategyContext.execute())
}
