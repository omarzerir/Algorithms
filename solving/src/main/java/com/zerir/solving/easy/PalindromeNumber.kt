package com.zerir.solving.easy

fun isPalindrome(x: Int): Boolean {
    /** if negative number */
    if (x < 0) return false
    /** if single number */
    if (x / 10 == 0) return true

    var maxDecimal: Long = 1
    var div = x

    val queue = mutableListOf<Int>()

    while (div != 0) {
        val newDiv = div / 10
        val remain = div % 10
        div = newDiv
        queue.add(remain)
        maxDecimal *= 10
    }

    var mirror: Long = 0

    queue.forEach {
        maxDecimal /= 10
        mirror += (it * maxDecimal)
    }

    return mirror == x.toLong()
}