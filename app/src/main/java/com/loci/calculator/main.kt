package com.loci.calculator

fun main() {
    var count = 1
    var result = 0
    var sign = ""
    while (true) {
        val input = readln() // readLine = nullable, readln = non-nullable
        val isInt = input.toIntOrNull()

        if (input == "-1") {
            println("계산 종료")
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
                if (input == "+" || input == "-" || input == "*" || input == "/" || input == "%") {
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
                when (sign) {
                    "+" -> {
                        val addOperation = AddOperation()
                        result = addOperation.calculator(input.toInt(), result)
                    }
                    "-" -> {
                        val subtractOperation = SubtractOperation()
                        result = subtractOperation.calculator(input.toInt(), result)
                    }
                    "*" -> {
                        val multiplyOperation = MultiplyOperation()
                        result = multiplyOperation.calculator(input.toInt(), result)
                    }
                    "/" -> {
                        val divideOperation = DivideOperation()
                        result = divideOperation.calculator(input.toInt(), result)
                    }
//                    "%" -> result = calculator.remainder()
                }

            }
            println("${result}")
            count++
        }


    }

}