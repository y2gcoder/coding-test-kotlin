package com.y2gcoder.codingtest.programmers.level1.personaltypetest.tries

import kotlin.math.abs


/**
 * 성격 유형 검사하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/118666
 */
class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val scores: MutableMap<PersonaltyType, Int> = evaluateScores(survey, choices)

        return generatePersonalty(scores)
    }

    private fun evaluateScores(
        survey: Array<String>,
        choices: IntArray
    ): MutableMap<PersonaltyType, Int> {
        val scores: MutableMap<PersonaltyType, Int> = createScoreBoard()

        survey.forEachIndexed { index, types ->
            val score = choiceToScore(choices[index])

            evaluateScore(types, score, scores)
        }
        return scores
    }

    private fun createScoreBoard(): MutableMap<PersonaltyType, Int> =
        enumValues<PersonaltyType>().associateWith { 0 }.toMutableMap()

    private fun choiceToScore(choice: Int): Int {
        return choice - CHOICE_MIDPOINT
    }

    private fun evaluateScore(
        types: String,
        score: Int,
        scores: MutableMap<PersonaltyType, Int>
    ) {
        val (minusType, plusType) = types.map { PersonaltyType.valueOf(it.toString()) }

        if (score < 0) {
            scores[minusType] = scores.getOrDefault(minusType, 0) + abs(score)
        }
        if (score > 0) {
            scores[plusType] = scores.getOrDefault(plusType, 0) + abs(score)
        }
    }

    private fun generatePersonalty(scores: MutableMap<PersonaltyType, Int>): String {
        return (GROUP_NUMBER_MIN..GROUP_NUMBER_MAX).joinToString("") { group ->
            val (type1, type2) = PersonaltyType.groupTypes(group)

            val type1Score = scores.getOrDefault(type1, 0)
            val type2Score = scores.getOrDefault(type2, 0)

            if (type1Score > type2Score) {
                type1.name
            } else if (type1Score < type2Score) {
                type2.name
            } else {
                listOf(type1, type2).maxByOrNull { it.priority }?.name ?: type1.name
            }
        }
    }

    companion object {
        private const val CHOICE_MIDPOINT = 4
        private const val GROUP_NUMBER_MIN = 1
        private const val GROUP_NUMBER_MAX = 4

    }

}

enum class PersonaltyType(val group: Int, val priority: Int) {
    R(1, 1), T(1, 0),
    C(2, 1), F(2, 0),
    J(3, 1), M(3, 0),
    A(4, 1), N(4, 0),
    ;

    companion object {
        fun groupTypes(group: Int): List<PersonaltyType> {
            return values().filter { it.group == group }
        }
    }
}