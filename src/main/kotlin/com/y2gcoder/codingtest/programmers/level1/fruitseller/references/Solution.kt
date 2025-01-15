package com.y2gcoder.codingtest.programmers.level1.fruitseller.references

/**
 * 최다 좋아요와 많은 사람들이 똑같이 풀이함
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808/solution_groups?language=kotlin
 * 나머지로 이렇게 간결하게 하실 수 있구나...
 */
class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        score.sortDescending()
        var num =0
        score.forEach{
            num+=1
            if(num%m == 0){
               answer+= it*m
            }
        }
        return answer
    }
}