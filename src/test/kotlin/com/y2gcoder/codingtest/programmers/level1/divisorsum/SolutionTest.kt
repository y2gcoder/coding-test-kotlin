package com.y2gcoder.codingtest.programmers.level1.divisorsum

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class SolutionTest : BehaviorSpec({
    val sut = Solution()

    given("n 이 12면") {
        val n = 12
        `when`("약수의 합은") {
            val result = sut.solution(n)

            then("28이다") {
                result shouldBe 28
            }
        }
    }

    given("n 이 5면") {
        val n = 5

        `when`("약수의 합은") {
            val result = sut.solution(n)

            then("6이다") {
                result shouldBe 6
            }
        }
    }

})
