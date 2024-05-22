package com.example.projectb

import com.example.common.Strategy
import org.springframework.stereotype.Component

@Component
class CustomStrategy : Strategy {
    override fun executeStrategy(): String {
        return "Executing Custom Strategy"
    }
}
