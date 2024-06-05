package com.loci.calculator

fun main() {
    var count = 1
    var result = 0
    var sign = ""
    while (true) {
        val input = readLine()!!
        val isInt = input.toIntOrNull()

        if (input == "end") {
            break
        }

        if (count == 1) {
            if (isInt == null) {
                println("숫자를 입력해주세요")
                continue
            } else {
                result = isInt
                println("입력값: ${isInt}")
                count++
                continue
            }
        }

        if (count % 2 == 0) {
            if (isInt != null) {
                println("부호를 입력해주세요")
                continue
            } else {
                if (input == "+" || input == "-" || input == "*" || input == "/") {
                    sign = input
                    println("입력부호: $sign")
                    count++
                } else {
                    println("${input}은 유효한 부호가 아닙니다.")
                    continue
                }

            }

        } else {
            println("입력값: ${input}")

            if (isInt == null) {
                println("유효한 숫자를 입력해주세요")
                continue
            } else {
                println("${result}${sign}${input} =")
                var calculator = Calculator(input.toInt(), result)
                when (sign) {
                    "+" -> result = calculator.add()
                    "-" -> result = calculator.minus()
                    "*" -> result = calculator.multiply()
                    "/" -> result = calculator.divide()
                }

            }
            println("${result}")
            count++
        }


    }

}