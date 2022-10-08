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
}
