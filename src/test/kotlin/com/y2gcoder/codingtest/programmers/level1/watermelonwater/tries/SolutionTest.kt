package com.y2gcoder.codingtest.programmers.level1.watermelonwater.tries 

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("길이를 받아서 수박수박수를 호출할 수 있다") {
        forAll(
            row(3, "수박수"),
            row(4, "수박수박"),
        ) { n: Int, expected: String ->
            val sut = Solution()
            sut.solution(n) shouldBe expected
        }
    }
})
