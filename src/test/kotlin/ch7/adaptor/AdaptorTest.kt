package ch7.adaptor

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.Enumeration

internal class AdaptorTest {

    @Test
    fun `Enumeration to Iterator`() {
        // given
        val enumerationArray: Enumeration<Long> = EnumerationArray.fromList(listOf(1, 2, 3))

        // when
        val enumerationIterator = EnumerationIterator(enumerationArray)

        // then
        assertThat(enumerationIterator).isInstanceOf(Iterator::class.java)
        assertThrows<UnsupportedOperationException> { enumerationIterator.remove() }
    }

    @Test
    fun `Iterator to Enumeration`() {
        // given
        val mutableList = mutableListOf(1, 2, 3, 4, 5)
        val iterator = mutableList.iterator()

        // when
        val iteratorEnumeration = IteratorEnumeration(iterator)

        // then
        assertThat(iteratorEnumeration).isInstanceOf(Enumeration::class.java)
    }
}
