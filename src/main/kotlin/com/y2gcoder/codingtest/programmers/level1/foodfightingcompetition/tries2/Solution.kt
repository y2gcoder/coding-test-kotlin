package com.y2gcoder.codingtest.programmers.level1.foodfightingcompetition.tries2

/**
 * 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 * 아이디어: 반만 만들고 0과 나머지 한쪽 문자열을 뒤집어서 넣어도 됨
 */
class Solution {
    fun solution(food: IntArray): String {
        val half = food.drop(1).mapIndexed { index, foodCount ->
            "${index + 1}".repeat(foodCount / 2)
        }

        return half.joinToString("") + "0" + half.reversed().joinToString("")
    }
}