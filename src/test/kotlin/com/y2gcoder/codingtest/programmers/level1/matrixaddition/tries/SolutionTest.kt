package com.y2gcoder.codingtest.programmers.level1.matrixaddition.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("행렬끼리 덧셈할 수 있다") {
        forAll(
            row(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(2, 3),
                ),
                arrayOf(
                    intArrayOf(3, 4),
                    intArrayOf(5, 6),
                ),
                arrayOf(
                    intArrayOf(4, 6),
                    intArrayOf(7, 9),
                ),
            ),
            row(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(2),
                ),
                arrayOf(
                    intArrayOf(3),
                    intArrayOf(4),
                ),
                arrayOf(
                    intArrayOf(4),
                    intArrayOf(6),
                ),
            ),
        ) { arr1, arr2, expected ->
            val sut = Solution()
            sut.solution(arr1, arr2) shouldBe expected
        }
    }
})
