package com.example.customstrategy

import com.example.common.Strategy
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Primary
@Component
class CustomStrategy : Strategy {
    override fun executeStrategy(): String {
        return "Executing CUSTOM Strategy !!!"
    }
}
