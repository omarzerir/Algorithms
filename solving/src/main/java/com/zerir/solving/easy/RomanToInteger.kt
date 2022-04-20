package com.zerir.solving.easy

fun romanToInt(s: String): Int {
    val numbers = generateRomanMap()
    var result = 0

    var i = 0

    while (i < s.length) {
        if(checkIfMultipleNumber(s[i])) {
            try {
                result += numbers["${s[i]}${s[i+1]}"]!!
                i += 2
            } catch (e: Exception) {
                result += numbers["${s[i]}"]!!
                i++
            }
        } else {
            result += numbers["${s[i]}"]!!
            i++
        }
    }

    return result
}

private fun checkIfMultipleNumber(c: Char): Boolean =
    c == 'I' || c == 'X' || c == 'C'

private fun generateRomanMap(): HashMap<String, Int> = hashMapOf(
    "I" to 1,
    "V" to 5,
    "X" to 10,
    "L" to 50,
    "C" to 100,
    "D" to 500,
    "M" to 1000,
    "IV" to 4,
    "IX" to 9,
    "XL" to 40,
    "XC" to 90,
    "CD" to 400,
    "CM" to 900,
)