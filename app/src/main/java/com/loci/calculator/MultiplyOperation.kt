package com.loci.calculator

class MultiplyOperation: Calculator() {
    override fun calculator(input: Int, result: Int): Int {
        return input * result
    }
}