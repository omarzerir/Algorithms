package com.zerir.implementation.search.binarySearch

import org.junit.Test

class BinarySearchTest {

    private val binarySearchManager = BinarySearch<Int>()

    @Test
    fun search_found() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 7

        val result = binarySearchManager.search(items, target)
        assert(result == 6)
    }

    @Test
    fun search_notFound() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 20

        val result = binarySearchManager.search(items, target)
        assert(result == -1)
    }

    @Test
    fun searchRecursively_found() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 7

        val result = binarySearchManager.searchRecursively(items, target)
        assert(result)
    }

    @Test
    fun searchRecursively_notFound() {
        val items = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 20

        val result = binarySearchManager.searchRecursively(items, target)
        assert(result.not())
    }

}