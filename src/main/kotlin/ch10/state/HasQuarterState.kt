package ch10.state

import ch10.Machine

class HasQuarterState(
    private val machine: Machine
) : State {
    override fun insertQuarter() {
        println("please put in a one quarter coin only")
    }

    override fun ejectQuarter() {
        println("ejecting quarter coin...")
        machine.setState(State.StateType.NO_QUARTER)
    }

    override fun turnCrank() {
        println("you turned the crank")
        machine.setState(State.StateType.SOLD)
    }

    override fun dispense() {
        throw IllegalStateException()
    }

    override fun getStateType() = State.StateType.HAS_QUARTER
}
