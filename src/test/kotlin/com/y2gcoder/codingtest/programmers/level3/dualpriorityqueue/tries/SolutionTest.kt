package com.y2gcoder.codingtest.programmers.level3.dualpriorityqueue.tries 
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("이중 우선순위 큐에 연산들을 입력하면 최종적으로 남아있는 [최댓값, 최솟값] 배열을 반환한다") {
        val operations = arrayOf("I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333")

        val sut = Solution()

        val actual = sut.solution(operations)

        val expected = intArrayOf(333, -45)

        actual shouldBe expected
    }

    context("이중 우선순위 큐가 비어있으면 [0, 0] 배열을 반환한다") {
        val operations = arrayOf("I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1")

        val sut = Solution()

        val actual = sut.solution(operations)

        val expected = intArrayOf(0, 0)

        actual shouldBe expected
    }
})
