package com.zerir.implementation.search

interface SearchManager<T: Comparable<T>> {

    fun search(items: List<T>, target: T) : Int = -1

    fun searchRecursively(items: List<T>, target: T): Boolean = false

}