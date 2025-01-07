package com.y2gcoder.codingtest.programmers.level1.stringtoint.tries

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SolutionTest : StringSpec({
    val sut = Solution()

    "1234" {
        val s = "1234"
        sut.solution(s) shouldBe s.toInt()
    }

    "-1234" {
        val s = "-1234"
        sut.solution(s) shouldBe s.toInt()
    }

})
