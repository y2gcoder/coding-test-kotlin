package com.y2gcoder.codingtest.programmers.level1.babbling2.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("아기가 옹알이로 발음할 수 있는지 체크한다") {
        forAll(
            row(
                arrayOf("aya", "yee", "u", "maa"),
                1,
            ),
            row(
                arrayOf("ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"),
                2,
            ),
            row(
                arrayOf("yeayaye"),
                1,
            ),
            row(
                arrayOf("mawooma"),
                1,
            ),
            row(
                arrayOf("yayae"),
                0
            )
        ) { babbling, expected ->
            val sut = Solution()
            val actual = sut.solution(babbling)
            actual shouldBe expected
        }
    }
})
