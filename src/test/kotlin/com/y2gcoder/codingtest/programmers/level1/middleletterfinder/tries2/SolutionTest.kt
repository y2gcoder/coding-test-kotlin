package com.y2gcoder.codingtest.programmers.level1.middleletterfinder.tries2

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("단어의 가운데 글자를 구할 수 있다") {
        forAll(
            row("abcde", "c"),
            row("qwer", "we"),
        ) { s: String, expected: String ->
            val sut = Solution()

            sut.solution(s) shouldBe expected
        }
    }
})
