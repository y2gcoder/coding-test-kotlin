package com.y2gcoder.codingtest.programmers.level1.failurerate.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

/**
 * N	stages	result
 * 5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
 * 4	[4,4,4,4,4]	[4,1,2,3]
 */
class SolutionTest : FunSpec({
    context("스테이지를 실패율 순으로 정렬할 수 있다(동일하면 낮은 스테이지부터)") {
        forAll(
            row(
                5,
                intArrayOf(2, 1, 2, 6, 2, 4, 3, 3,),
                intArrayOf(3, 4, 2, 1, 5,),
            ),
            row(
                4,
                intArrayOf(4, 4, 4, 4, 4,),
                intArrayOf(4, 1, 2, 3,),
            ),
        ) { N, stages, expected ->
            val sut = Solution()
            sut.solution(N, stages) shouldBe expected
        }
    }
})
