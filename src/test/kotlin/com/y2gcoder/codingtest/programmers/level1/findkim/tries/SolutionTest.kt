package com.y2gcoder.codingtest.programmers.level1.findkim.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("서울 배열에서 김서방을 찾을 수 있다") {
        val seoul = arrayOf("Jane", "Kim")

        val expected = "김서방은 1에 있다"

        val sut = Solution()

        sut.solution(seoul) shouldBe expected
    }

})
