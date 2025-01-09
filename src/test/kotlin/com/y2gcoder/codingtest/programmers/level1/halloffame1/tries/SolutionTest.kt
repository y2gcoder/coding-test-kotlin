package com.y2gcoder.codingtest.programmers.level1.halloffame1.tries

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SolutionTest : StringSpec({
    val sut = Solution()

    "given k=3, score=[10, 100, 20, 150, 1, 100, 200] then answer = [10, 10, 10, 20, 20, 100, 100]" {
        val k = 3
        val score = intArrayOf(10, 100, 20, 150, 1, 100, 200)

        val answer = sut.solution(k, score)

        answer shouldBe intArrayOf(10, 10, 10, 20, 20, 100, 100)
    }

    "given k=4, score=[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000] then answer = [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]" {
        val k = 4
        val score = intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000)

        val answer = sut.solution(k, score)

        answer shouldBe intArrayOf(0, 0, 0, 0, 20, 40, 70, 70, 150, 300)
    }
})
