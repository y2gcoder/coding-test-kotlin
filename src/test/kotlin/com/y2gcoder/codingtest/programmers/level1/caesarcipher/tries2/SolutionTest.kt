package com.y2gcoder.codingtest.programmers.level1.caesarcipher.tries2

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("시저 암호를 해석할 수 있다") {
        forAll(
            row("AB", 1,  "BC"),
            row("z", 1,  "a"),
            row("a B z", 4,  "e F d"),
        ) { s, n, expected ->
            val sut = Solution()
            sut.solution(s, n) shouldBe expected
        }
    }
})
