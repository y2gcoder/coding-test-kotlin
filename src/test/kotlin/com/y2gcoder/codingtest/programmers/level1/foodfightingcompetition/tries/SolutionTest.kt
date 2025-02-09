package com.y2gcoder.codingtest.programmers.level1.foodfightingcompetition.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("음식 배열을 받아 좌우 선수가 똑같이 순서대로 먹을 수 있게 배열할 수 있다") {
        forAll(
            row(
                intArrayOf(1, 3, 4, 6),
                "1223330333221"
            ),
            row(
                intArrayOf(1, 7, 1, 2),
                "111303111"
            ),
        ) { food: IntArray, expected: String ->
            val sut = Solution()
            val actual = sut.solution(food)
            actual shouldBe expected
        }
    }
})
