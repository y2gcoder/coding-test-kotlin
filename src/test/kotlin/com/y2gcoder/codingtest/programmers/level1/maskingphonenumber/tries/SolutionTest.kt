package com.y2gcoder.codingtest.programmers.level1.maskingphonenumber.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("휴대폰번호를 끝 네자리만 제외하고 마스킹 처리할 수 있다") {
        forAll(
            row(
                "01033334444",
                "*******4444",
            ),
            row(
                "027778888",
                "*****8888",
            ),
        ) { phone_number, expected ->
            val sut = Solution()

            sut.solution(phone_number) shouldBe expected
        }
    }
})
