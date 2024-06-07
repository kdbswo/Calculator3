package com.loci.calculator

class DivideOperation: Calculator() {
    override fun calculator(input: Int, result: Int): Int {
        return result / input
    }
}