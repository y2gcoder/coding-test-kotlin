package com.y2gcoder.codingtest.programmers.level1.rectangularstar.tries

/**
 * 직사각형 별찍기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12969
 */
fun main(args: Array<String>) {
    val (cols, rows) = readln().split(' ').map(String::toInt)
    repeat((1..rows).count()) {
        println("*".repeat(cols))
    }
}