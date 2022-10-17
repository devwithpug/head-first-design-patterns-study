package ch10

import ch10.state.State
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachineTest {

    @Test
    fun `정상 플로우 테스트`() {
        // given
        val machine = Machine(DEFAULT_NUMBER_OF_BALLS)

        // when
        machine.insertQuarter()
        machine.turnCrank()

        // then
        assertThat(machine.getCount()).isEqualTo(DEFAULT_NUMBER_OF_BALLS - 1)
        assertThat(machine.getState()).isEqualTo(State.StateType.NO_QUARTER)
    }

    @Test
    fun `동전이 없는 상황에서 손잡이를 돌리는 플로우 테스트`() {
        // given
        val machine = Machine(DEFAULT_NUMBER_OF_BALLS)

        // when
        machine.insertQuarter()
        machine.ejectQuarter()
        machine.turnCrank()

        // then
        assertThat(machine.getCount()).isEqualTo(DEFAULT_NUMBER_OF_BALLS)
        assertThat(machine.getState()).isEqualTo(State.StateType.NO_QUARTER)
    }

    @Test
    fun `동전이 없는 상황에서 반환을 요청하는 플로우 테스트`() {
        // given
        val machine = Machine(DEFAULT_NUMBER_OF_BALLS)

        // when
        machine.insertQuarter()
        machine.turnCrank()
        machine.ejectQuarter()

        // then
        assertThat(machine.getCount()).isEqualTo(DEFAULT_NUMBER_OF_BALLS - 1)
        assertThat(machine.getState()).isEqualTo(State.StateType.NO_QUARTER)
    }

    @Test
    fun `동전을 넣은 상태 테스트`() {
        // given
        val machine = Machine(DEFAULT_NUMBER_OF_BALLS)

        // when
        machine.insertQuarter()

        // then
        assertThat(machine.getCount()).isEqualTo(DEFAULT_NUMBER_OF_BALLS)
        assertThat(machine.getState()).isEqualTo(State.StateType.HAS_QUARTER)
    }

    @Test
    fun `매진 테스트`() {
        // given
        val machine = Machine(DEFAULT_NUMBER_OF_BALLS)

        // when
        repeat(DEFAULT_NUMBER_OF_BALLS) {
            machine.insertQuarter()
            machine.turnCrank()
        }

        // then
        assertThat(machine.getCount()).isEqualTo(0)
        assertThat(machine.getState()).isEqualTo(State.StateType.SOLD_OUT)
    }

    companion object {
        private const val DEFAULT_NUMBER_OF_BALLS = 5
    }
}
