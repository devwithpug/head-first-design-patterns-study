package ch7.adaptor

import java.util.Enumeration

class EnumerationIterator<T>(
    private val enumeration: Enumeration<T>
): MutableIterator<T> {

    override fun hasNext(): Boolean {
        return enumeration.hasMoreElements()
    }

    override fun next(): T {
        return enumeration.nextElement()
    }

    override fun remove() {
        throw UnsupportedOperationException()
    }
}
