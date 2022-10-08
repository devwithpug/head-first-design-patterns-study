package ch7.adaptor

import java.util.Enumeration

class IteratorEnumeration<T>(
    private val iterator: Iterator<T>
): Enumeration<T> {
    override fun hasMoreElements(): Boolean {
        return iterator.hasNext()
    }

    override fun nextElement(): T {
        return iterator.next()
    }
}
