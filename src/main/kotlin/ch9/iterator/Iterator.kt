package ch9.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}