package com.y2gcoder.codingtest.programmers.level1.personaltypetest.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

private data class SolutionTestData(val survey: Array<String>, val choices: IntArray, val expectedResult: String)

class SolutionTest : FunSpec({
    context("설문지와 응답을 받아 성격유형검사 결과를 알 수 있다") {
        withData(
            SolutionTestData(
                survey = arrayOf("AN", "CF", "MJ", "RT", "NA"),
                choices = intArrayOf(5, 3, 2, 7, 5),
                expectedResult = "TCMA",
            ),
            SolutionTestData(
                survey = arrayOf("TR", "RT", "TR"),
                choices = intArrayOf(7, 1, 3),
                expectedResult = "RCJA",
            ),
        ) { (survey, choices, expectedResult) ->
            val sut = Solution()
            sut.solution(survey, choices) shouldBe expectedResult
        }
    }
})
