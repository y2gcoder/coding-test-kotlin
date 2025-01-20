package com.y2gcoder.codingtest.programmers.level1.reversedint.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("정수를 받아 내림차순으로 정렬한 후 이은 숫자를 구할 수 있다") {
        val n: Long = 118372

        val sut = Solution()

        val actual = sut.solution(n)

        val expected: Long = 873211

        actual shouldBe expected
    }

})
