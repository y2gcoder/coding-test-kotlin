package com.y2gcoder.codingtest.programmers.level1.middleletterfinder.tries

import kotlin.math.ceil

/**
 * 가운데 글자 가져오기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12903?language=kotlin
 * 다른 아이디어: 인덱스가 아니라 길이 기준으로 하면 ((길이 - 1) / 2)..(길이 / 2) 범위로도 되나?
 */
class Solution {
    fun solution(s: String): String {
        return s.substring((s.lastIndex / 2)..ceil(s.lastIndex.toDouble() / 2).toInt())
    }
}