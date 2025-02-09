package com.y2gcoder.codingtest.programmers.level1.numericstringsandenglishwords.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("숫자와 숫자영단어가 포함된 문자열을 원래 숫자로 바꿀 수 있다") {
        forAll(
            row("one4seveneight", 1478),
            row("23four5six7", 234567),
            row("2three45sixseven", 234567),
            row("123", 123),
        ) { s, expected ->
            val sut = Solution()
            val actual = sut.solution(s)
            actual shouldBe expected
        }
    }
})
