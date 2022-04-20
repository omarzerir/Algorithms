package com.zerir.implementation.search.linearSearch

import com.zerir.implementation.search.SearchManager

class LinearSearch<T: Comparable<T>> : SearchManager<T> {

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     * */
    override fun search(items: List<T>, target: T): Int {

        items.forEachIndexed { index, item ->
            if(item == target) return index
        }

        return super.search(items, target)
    }

}