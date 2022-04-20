package com.zerir.implementation.search.linearSearch

import org.junit.Test

class LinearSearchTest {

    private val linearSearchManager = LinearSearch<Int>()

    @Test
    fun search_found() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 3

        val result = linearSearchManager.search(items, target)
        assert(result == 2)
    }

    @Test
    fun search_notFound() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 11

        val result = linearSearchManager.search(items, target)
        assert(result == -1)
    }

}