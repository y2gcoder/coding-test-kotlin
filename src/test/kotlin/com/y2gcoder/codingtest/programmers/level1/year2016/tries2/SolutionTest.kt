package com.y2gcoder.codingtest.programmers.level1.year2016.tries2

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("2016년 a월 b일이 무슨 요일이었는지 구할 수 있다") {
        val a = 5
        val b = 24

        val sut = Solution()

        val actual = sut.solution(a, b)

        actual shouldBe "TUE"
    }
})
