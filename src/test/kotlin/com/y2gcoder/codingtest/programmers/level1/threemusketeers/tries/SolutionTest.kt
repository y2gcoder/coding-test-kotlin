package com.y2gcoder.codingtest.programmers.level1.threemusketeers.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("학생들의 정수 번호 배열 중 3명을 뽑아서 더했을 때 0이 되는 삼총사 케이스의 수를 구할 수 있다") {
        forAll(
            row(intArrayOf(-2, 3, 0, 2, -5), 2),
            row(intArrayOf(-3, -2, -1, 0, 1, 2, 3), 5),
            row(intArrayOf(-1, 1, -1, 1), 0),
        ) { number, expected ->
            val sut = Solution()
            sut.solution(number) shouldBe expected
        }
    }

})
