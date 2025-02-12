package com.y2gcoder.codingtest.programmers.level1.arbitrarilysortstrings.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("문자열 리스트를 받아 n번째 순서의 알파벳 순서대로 정렬할 수 있다") {
        forAll(
            row(
                arrayOf("sun", "bed", "car"),
                1,
                arrayOf("car", "bed", "sun"),
            ),
            row(
                arrayOf("abce", "abcd", "cdx"),
                2,
                arrayOf("abcd", "abce", "cdx"),
            ),
        ) { strings, n, expected ->
            val sut = Solution()
            val actual = sut.solution(strings, n)
            actual shouldBe expected
        }
    }
})
