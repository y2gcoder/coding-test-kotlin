package com.y2gcoder.codingtest.programmers.level1.smallsubnumberstringcounter.tries2

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("길이가 긴 숫자 문자열을 길이가 짧은 숫자 문자열 길이만큼 잘랐을 때 짧은 숫자 문자열보다 작은 갯수를 구할 수 있다") {
        forAll(
            row("3141592", "271", 2),
            row("500220839878", "7", 8),
            row("10203", "15", 3),
        ) { t, p, expected ->
            val sut = Solution()
            sut.solution(t, p) shouldBe expected
        }
    }
})
