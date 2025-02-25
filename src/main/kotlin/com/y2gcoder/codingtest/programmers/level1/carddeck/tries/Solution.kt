package com.y2gcoder.codingtest.programmers.level1.carddeck.tries

/**
 * 카드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val card1queue = ArrayDeque(cards1.toList())
        val card2queue = ArrayDeque(cards2.toList())

        for (word in goal) {
            if (card1queue.isNotEmpty() && card1queue.first() == word) {
                card1queue.removeFirst()
                continue
            }
            if (card2queue.isNotEmpty() && card2queue.first() == word) {
                card2queue.removeFirst()
                continue
            }
            return "No"
        }


        return "Yes"
    }
}