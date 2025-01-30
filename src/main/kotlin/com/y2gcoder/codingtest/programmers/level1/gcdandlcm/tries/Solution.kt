package com.y2gcoder.codingtest.programmers.level1.gcdandlcm.tries

/**
 * 최대공약수와 최소공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12940
 * 아이디어: 유클리드 호제법을 이용해서 최대공약수를 구함!
 */
class Solution {
    fun solution(n: Int, m: Int): IntArray {
        val gcd: Int = gcd(n, m)
        val lcm: Int = (n * m) / gcd
        return intArrayOf(gcd, lcm)
    }

    private tailrec fun gcd(n: Int, m: Int): Int {
        if (m == 0) {
            return n
        }
        return gcd(m, n % m)
    }
}