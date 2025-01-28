package com.y2gcoder.codingtest.programmers.level1.sortingstringbydescendingorder.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("문자열을 내림차순으로, 대문자는 소문자보다 작은 걸로 간주해서 정렬하여 반환한다") {
        val sut = Solution()

        sut.solution("Zbcdefg") shouldBe "gfedcbZ"
    }
})
