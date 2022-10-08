package ch7.adaptor

import java.util.Enumeration

class EnumerationArray<T>(
    private val elements: Array<T>
): Enumeration<T> {
    private var pos = 0

    override fun hasMoreElements(): Boolean {
        return elements.size > pos
    }

    override fun nextElement(): T {
        return elements[pos++]
    }

    companion object {
        inline fun <reified T>fromList(list: List<T>): EnumerationArray<T> {
            return EnumerationArray(list.toTypedArray())
        }
    }
}
