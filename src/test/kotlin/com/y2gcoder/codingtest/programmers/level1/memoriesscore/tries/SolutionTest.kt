package com.y2gcoder.codingtest.programmers.level1.memoriesscore.tries

import io.kotest.core.spec.style.FunSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe

class SolutionTest : FunSpec({
    context("사진별로 추억점수를 매길 수 있다") {
        forAll(
            row(
                arrayOf("may", "kein", "kain", "radi"),
                intArrayOf(5, 10, 1, 3),
                arrayOf(
                    arrayOf("may", "kein", "kain", "radi"),
                    arrayOf("may", "kein", "brin", "deny"),
                    arrayOf("kon", "kain", "may", "coni"),
                ),
                intArrayOf(19, 15, 6),
            ),
            row(
                arrayOf("kali", "mari", "don"),
                intArrayOf(11, 1, 55),
                arrayOf(
                    arrayOf("kali", "mari", "don"),
                    arrayOf("pony", "tom", "teddy"),
                    arrayOf("con", "mona", "don"),
                ),
                intArrayOf(67, 0, 55),
            ),
            row(
                arrayOf("may", "kein", "kain", "radi"),
                intArrayOf(5, 10, 1, 3),
                arrayOf(
                    arrayOf("may"),
                    arrayOf("kein", "deny", "may"),
                    arrayOf("kon", "coni"),
                ),
                intArrayOf(5, 15, 0),
            ),
        ) { name, yearning, photo, expected ->
            val sut = Solution()
            val actual = sut.solution(name, yearning, photo)
            actual shouldBe expected
        }
    }

})
