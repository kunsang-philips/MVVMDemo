package com.dogpo.mvvmdemo.add

import javax.inject.Inject

class AddImpl1 @Inject constructor() : Add {
    override fun add(number1: Int, number2: Int): Int {
        return number1 + number2
    }
}
