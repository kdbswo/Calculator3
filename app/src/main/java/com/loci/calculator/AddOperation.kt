package com.loci.calculator

class AddOperation : Calculator() {
    override fun calculator(input: Int, result: Int): Int {
        return input + result
    }
}