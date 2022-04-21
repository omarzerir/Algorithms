package com.zerir.solving.easy

fun longestCommonPrefix(strs: Array<String>): String {
    var result = ""

    repeat(strs[0].length) { i ->
        for (s in strs) {
            if (i == s.length || s[i] != strs[0][i]) return result
        }
        result += strs[0][i]
    }

    return result
}