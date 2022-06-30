package ch1.simuduck.duck

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class DuckTest {

    @Test
    fun `MallardDuck 테스트`() {
        // given
        val mallardDuck = MallardDuck()

        // when
        val name = mallardDuck.name
        val fly = mallardDuck.fly()
        val quack = mallardDuck.quack()

        // then
        Assertions.assertThat(name).isEqualTo("mallard duck")
        Assertions.assertThat(fly).isEqualTo("fly with wings")
        Assertions.assertThat(quack).isEqualTo("quack")
    }

    @Test
    fun `RedheadDuck 테스트`() {
        // given
        val redheadDuck = RedheadDuck()

        // when
        val name = redheadDuck.name
        val fly = redheadDuck.fly()
        val quack = redheadDuck.quack()

        // then
        Assertions.assertThat(name).isEqualTo("redhead duck")
        Assertions.assertThat(fly).isEqualTo("fly with wings")
        Assertions.assertThat(quack).isEqualTo("quack")
    }

    @Test
    fun `RubberDuck 테스트`() {
        // given
        val rubberDuck = RubberDuck()

        // when
        val name = rubberDuck.name
        val quack = rubberDuck.quack()

        // then
        Assertions.assertThat(name).isEqualTo("rubber duck")
        assertThrows<UnsupportedOperationException> { rubberDuck.fly() }
        Assertions.assertThat(quack).isEqualTo("squeak")
    }

    @Test
    fun `DecoyDuck 테스트`() {
        // given
        val decoyDuck = DecoyDuck()

        // when
        val name = decoyDuck.name

        // then
        Assertions.assertThat(name).isEqualTo("decoy duck")
        assertThrows<UnsupportedOperationException> { decoyDuck.fly() }
        assertThrows<UnsupportedOperationException> { decoyDuck.quack() }
    }
}
