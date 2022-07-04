package ch3.decorator

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class BeverageTest {

    @Test
    fun `darkRoastWithMilkAndWhip 테스트`() {
        // given
        val darkRoast = DarkRoast()
        val darkRoastWithMilk = Milk(darkRoast)
        val darkRoastWithMilkAndWhip = Whip(darkRoastWithMilk)

        // when
        val description = darkRoastWithMilkAndWhip.description()
        val cost = darkRoastWithMilkAndWhip.cost()

        // then
        Assertions.assertThat(description).isEqualTo("dark roast, milk, whip")
        Assertions.assertThat(cost).isEqualTo(4.75)
    }
}
