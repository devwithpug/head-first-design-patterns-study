package ch1.strategy.duck

import ch1.strategy.behavior.FlyRocketPowered
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class DuckTest {

    @Test
    fun `MallardDuck 테스트`() {
        // given
        val mallardDuck = MallardDuck()

        // when
        val name = mallardDuck.name
        val fly = mallardDuck.performFly()
        val quack = mallardDuck.performQuack()

        // then
        assertThat(name).isEqualTo("mallard duck")
        assertThat(fly).isEqualTo("fly with wings")
        assertThat(quack).isEqualTo("quack")
    }

    @Test
    fun `RedheadDuck 테스트`() {
        // given
        val redheadDuck = RedheadDuck()

        // when
        val name = redheadDuck.name
        val fly = redheadDuck.performFly()
        val quack = redheadDuck.performQuack()

        // then
        assertThat(name).isEqualTo("redhead duck")
        assertThat(fly).isEqualTo("fly with wings")
        assertThat(quack).isEqualTo("quack")
    }

    @Test
    fun `RubberDuck 테스트`() {
        // given
        val rubberDuck = RubberDuck()

        // when
        val name = rubberDuck.name
        val quack = rubberDuck.performQuack()

        // then
        assertThat(name).isEqualTo("rubber duck")
        assertThrows<UnsupportedOperationException> { rubberDuck.performFly() }
        assertThat(quack).isEqualTo("squeak")
    }

    @Test
    fun `DecoyDuck 테스트`() {
        // given
        val decoyDuck = DecoyDuck()

        // when
        val name = decoyDuck.name

        // then
        assertThat(name).isEqualTo("decoy duck")
        assertThrows<UnsupportedOperationException> { decoyDuck.performFly() }
        assertThrows<UnsupportedOperationException> { decoyDuck.performQuack() }
    }

    @Test
    fun `ModelDuck 테스트`() {
        // given
        val modelDuck = ModelDuck()

        // when
        modelDuck.setFlyBehavior(FlyRocketPowered())
        val fly = modelDuck.performFly()

        // then
        assertThat(fly).isEqualTo("to the moon!")
    }
}
