package com.y2gcoder.codingtest.programmers.level1.carddeck.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("두 카드 뭉치의 순서대로 단어를 뽑아 해당 문장을 만들 수 있는지 알 수 있다") {
        forAll(
            row(
                arrayOf("i", "drink", "water"),
                arrayOf("want", "to"),
                arrayOf("i", "want", "to", "drink", "water"),
                "Yes",
            ),
            row(
                arrayOf("i", "water", "drink"),
                arrayOf("want", "to"),
                arrayOf("i", "want", "to", "drink", "water"),
                "No",
            ),
        ) {cards1, cards2, goal, expected ->
            val sut = Solution()
            val actual = sut.solution(cards1, cards2, goal)
            actual shouldBe expected
        }
    }
})
