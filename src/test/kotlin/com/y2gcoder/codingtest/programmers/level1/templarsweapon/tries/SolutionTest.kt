package com.y2gcoder.codingtest.programmers.level1.templarsweapon.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("기사단원의 무기를 만들기 위한 철의 무게를 구할 수 있다") {
        forAll(
            row(5, 3, 2, 10),
            row(10, 3, 2, 21),
        ) { number, limit, power, expected ->
            val sut = Solution()
            val actual = sut.solution(number, limit, power)
            actual shouldBe expected
        }
    }
})
