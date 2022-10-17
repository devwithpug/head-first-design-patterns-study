package ch10.state

import ch10.Machine

class NoQuarterState(
    private val machine: Machine
) : State {
    override fun insertQuarter() {
        println("putting in a quarter coin...")
        machine.setState(State.StateType.HAS_QUARTER)
    }

    override fun ejectQuarter() {
        println("please put in a quarter coin")
    }

    override fun turnCrank() {
        println("please put in a quarter coin")
    }

    override fun dispense() {
        println("please put in a quarter coin")
    }

    override fun getStateType() = State.StateType.NO_QUARTER
}
