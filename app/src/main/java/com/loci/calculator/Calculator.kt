package com.loci.calculator


class Calculator(val input: Int, result: Int) {
    var temp = 0

    init {
        temp = result
    }

    fun add(): Int {
        temp += input
        return temp
    }

    fun minus(): Int {
        temp -= input
        return temp
    }

    fun multiply(): Int {
        temp *= input
        return temp
    }

    fun divide(): Int {
        temp /= input
        return temp
    }

    fun remainder(): Int {
        temp %= input
        return temp
    }

}