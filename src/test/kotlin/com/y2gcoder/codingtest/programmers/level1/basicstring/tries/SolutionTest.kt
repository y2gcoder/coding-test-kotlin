package com.y2gcoder.codingtest.programmers.level1.basicstring.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("문자열이 4~6자리인지, 숫자로만 되어있는지 체크할 수 있다") {
        forAll(
            row("a234", false),
            row("1234", true),
        ) { s, expected ->
            val sut = Solution()
            sut.solution(s) shouldBe expected
        }
    }
})
