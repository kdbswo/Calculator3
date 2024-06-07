package com.loci.calculator

class SubtractOperation: Calculator() {
    override fun calculator(input: Int, result: Int): Int {
        return input - result
    }
}