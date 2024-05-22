package com.example.projecta

import com.example.common.Strategy
import org.springframework.stereotype.Component

@Component
class DefaultStrategy : Strategy {
    override fun executeStrategy(): String {
        return "Executing Default Strategy"
    }
}
