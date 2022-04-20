package com.zerir.implementation.search.binarySearch

import com.zerir.implementation.search.SearchManager

class BinarySearch<T : Comparable<T>> : SearchManager<T> {

    /**
     * Requirements: [sorted list]
     * Time Complexity: O(Log n)
     * Space Complexity: O(1)
     * */
    override fun search(items: List<T>, target: T): Int {
        var left = 0
        var right = items.size - 1

        while (left <= right) {
            val midIndex = (left + right) / 2
            val mid = items[midIndex]

            when {
                mid == target -> return midIndex
                mid > target -> right = midIndex - 1
                else -> left = midIndex + 1
            }
        }

        return super.search(items, target)
    }

    /**
     * Requirements: [sorted list]
     * Time Complexity: O(Log n)
     * Space Complexity: O(Log n) (depends on language)
     *              in kotlin we could use [tailrec] keyword to convert recursion to iterative,
     *              this will make [space complexity] O(1)
     * */
    override tailrec fun searchRecursively(items: List<T>, target: T): Boolean {
        if (items.isEmpty()) return super.searchRecursively(items, target)
        else {
            val midIndex = items.size / 2
            val mid = items[midIndex]
            if (mid == target) return true
            val newItems =
                if (mid > target) items.slice(0 until midIndex)
                else items.slice(midIndex + 1 until items.size)
            return searchRecursively(newItems, target)
        }
    }

}