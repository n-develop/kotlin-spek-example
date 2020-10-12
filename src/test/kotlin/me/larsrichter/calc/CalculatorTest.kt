package me.larsrichter.calc

import org.junit.jupiter.api.Assertions.assertEquals
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CalculatorTest: Spek({
    describe("add functionality") {
        it("should add 2 positive numbers") {
            assertEquals(10, Calculator().add(8,2))
        }
        it("does stuff") {
            assertEquals(6, Calculator().add(3,3))
        }
    }
})