package com.y2gcoder.codingtest.programmers.level1.mockexam.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("수포자 3명 중 높은 점수를 받은 사람을 출력할 수 있다") {
        forAll(
            row(
                intArrayOf(1, 2, 3, 4, 5),
                intArrayOf(1),
            ),
            row(
                intArrayOf(1, 3, 2, 4, 2),
                intArrayOf(1, 2, 3),
            ),
        ) { answers, expected ->
            val sut = Solution()
            sut.solution(answers) shouldBe expected
        }
    }

})
