package com.y2gcoder.codingtest.programmers.level1.strangecharacterscreator.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("단어 기준으로 짝수 인덱스는 대문자로, 홀수 인덱스는 소문자로 변환한 문자열을 반환할 수 있다") {
        val s = "try hello world"

        val sut = Solution()

        val expected = "TrY HeLlO WoRlD"

        sut.solution(s) shouldBe expected
    }
})
