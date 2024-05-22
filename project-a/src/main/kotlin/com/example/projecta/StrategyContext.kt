package com.example.projecta

import com.example.common.Strategy
import com.example.projectb.CustomStrategy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class StrategyContext(@Autowired(required = false) private val strategy: Strategy?) {
    fun execute(): String {
        return strategy?.executeStrategy() ?: CustomStrategy().executeStrategy()
    }
}
