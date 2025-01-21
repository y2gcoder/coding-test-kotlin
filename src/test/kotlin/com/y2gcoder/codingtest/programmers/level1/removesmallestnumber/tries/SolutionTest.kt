package com.y2gcoder.codingtest.programmers.level1.removesmallestnumber.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("정수 배열에서 가장 작은 수를 제거한 배열을 리턴한다") {
        val arr = intArrayOf(4, 3, 2, 1)

        val sut = Solution()

        val actual = sut.solution(arr)

        val expected = intArrayOf(4, 3, 2)

        actual shouldBe expected
    }

    context("가장 작은 수를 제거한 배열이 비었으면 -1을 채워 리턴한다") {
        val arr = intArrayOf(10)

        val sut = Solution()

        val actual = sut.solution(arr)

        val expected = intArrayOf(-1)

        actual shouldBe expected
    }

})
