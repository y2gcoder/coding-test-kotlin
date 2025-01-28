package com.y2gcoder.codingtest.programmers.level1.shortfallcalculator.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("놀이기구의 N번 타는데 내 보유 금액이 얼마나 부족한지 계산할 수 있다") {
        val price = 3
        val money = 20
        val count = 4

        val sut = Solution()

        val expected = 10

        sut.solution(price, money, count) shouldBe expected

    }
})
