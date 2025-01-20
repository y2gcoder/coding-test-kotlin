package com.y2gcoder.codingtest.programmers.level1.divisiblesortednumbers.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class TestData(val arr: IntArray, val divisor: Int, val expected: IntArray)

class SolutionTest : FunSpec({
    context("주어진 숫자 배열 중 지정한 숫자로 나누어 떨어지는 숫자만 모아 정렬한 배열을 구할 수 있다") {
        withData(
            TestData(
                arr = intArrayOf(5, 9, 7, 10),
                divisor = 5,
                expected = intArrayOf(5, 10),
            ),
            TestData(
                arr = intArrayOf(2, 36, 1, 3),
                divisor = 1,
                expected = intArrayOf(1, 2, 3, 36),
            ),
            TestData(
                arr = intArrayOf(3, 2, 6),
                divisor = 10,
                expected = intArrayOf(-1),
            ),
        ) { (arr, divisor, expected) ->
            val sut = Solution()

            sut.solution(arr, divisor) shouldBe expected
        }
    }
})
