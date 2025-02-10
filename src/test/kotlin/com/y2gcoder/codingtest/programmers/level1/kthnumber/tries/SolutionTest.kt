package com.y2gcoder.codingtest.programmers.level1.kthnumber.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("커맨드에 따라 배열을 자르고 정렬한 뒤 k번째 수를 구할 수 있다") {
        forAll(
            row(
                intArrayOf(1, 5, 2, 6, 3, 7, 4),
                arrayOf(
                    intArrayOf(2, 5, 3),
                    intArrayOf(4, 4, 1),
                    intArrayOf(1, 7, 3),
                ),
                intArrayOf(5, 6, 3),
            )
        ) { array: IntArray, commands: Array<IntArray>, expected: IntArray ->
            val sut = Solution()
            val actual = sut.solution(array, commands)
            actual shouldBe expected
        }
    }
})
