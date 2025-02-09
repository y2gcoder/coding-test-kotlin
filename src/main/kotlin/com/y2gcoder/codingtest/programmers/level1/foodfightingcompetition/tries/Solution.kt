package com.y2gcoder.codingtest.programmers.level1.foodfightingcompetition.tries

/**
 * 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 * 다른 아이디어: 반만 만들고 0과 나머지 한쪽 문자열을 뒤집어서 넣어도 됨
 */
class Solution {
    fun solution(food: IntArray): String {
        val targetFoods = food.slice((1..food.lastIndex))
        val result = mutableListOf("0")

        targetFoods.reversed().forEachIndexed { index, foodCount ->
            val value = "${targetFoods.size - index}".repeat(foodCount / 2)
            result.add(0, value)
            result.add(value)
        }

        return result.joinToString("")
    }
}