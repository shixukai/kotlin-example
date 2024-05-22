package com.example.projecta

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.core.env.Environment

@SpringBootApplication
@ComponentScan(basePackages = ["\${spring.main.scan-base-packages}"])
open class MainApplication

fun main(args: Array<String>) {
    val context = runApplication<MainApplication>(*args)
    val strategyContext = context.getBean(StrategyContext::class.java)
    println(strategyContext.execute())
}
