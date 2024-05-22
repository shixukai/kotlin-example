package com.example.projecta

import com.example.common.Strategy
import org.springframework.context.annotation.Lazy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class StrategyContext(@Autowired(required = false) @Lazy private val strategy: Strategy?) {
    fun execute(): String {
        return strategy?.executeStrategy() ?: "No strategy available"
    }
}
