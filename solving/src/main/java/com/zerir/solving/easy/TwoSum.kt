package com.zerir.solving.easy

fun twoSum(nums: IntArray, target: Int): IntArray {
    val hashMap = HashMap<Int, Int>()
    nums.forEachIndexed { index, value ->
        val dif = target - value
        if (hashMap.contains(dif)) {
            return intArrayOf(hashMap[dif]!!, index)
        }
        hashMap[value] = index
    }
    throw IllegalArgumentException("No two sum solution")
}