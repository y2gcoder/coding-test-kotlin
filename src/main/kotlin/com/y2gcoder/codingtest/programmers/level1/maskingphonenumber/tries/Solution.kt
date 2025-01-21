package com.y2gcoder.codingtest.programmers.level1.maskingphonenumber.tries

/**
 * 핸드폰 번호 가리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */
class Solution {
    fun solution(phone_number: String): String =
        "*".repeat(phone_number.length - 4) + phone_number.takeLast(4)
}