package com.y2gcoder.codingtest.programmers.level1.minimumrectangle.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("다양한 크기들의 명함을 받아 모든 명함이 들어가는 최소 크기의 명함 지갑 넓이를 구할 수 있다") {
        forAll(
            row(
                arrayOf(
                    intArrayOf(60, 50),
                    intArrayOf(30, 70),
                    intArrayOf(60, 30),
                    intArrayOf(80, 40),
                ),
                4000,
            ),
            row(
                arrayOf(
                    intArrayOf(10, 7),
                    intArrayOf(12, 3),
                    intArrayOf(8, 15),
                    intArrayOf(14, 7),
                    intArrayOf(5, 15),
                ),
                120,
            ),
            row(
                arrayOf(
                    intArrayOf(14, 4),
                    intArrayOf(19, 6),
                    intArrayOf(6, 16),
                    intArrayOf(18, 7),
                    intArrayOf(7, 11),
                ),
                133,
            ),
        ) { sizes: Array<IntArray>, expected: Int ->
            val sut = Solution()
            sut.solution(sizes) shouldBe expected
        }
    }
})
