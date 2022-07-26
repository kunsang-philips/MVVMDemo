package com.dogpo.mvvmdemo.add

class AddImpl2 : Add {
    override fun add(number1: Int, number2: Int): Int {
        return 2 * (number1 + number2)
    }
}
