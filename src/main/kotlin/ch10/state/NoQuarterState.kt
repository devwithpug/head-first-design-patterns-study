package ch10.state

import ch10.Machine

class NoQuarterState : State {
    override fun insertQuarter(machine: Machine) {
        println("putting in a quarter coin...")
        machine.setState(State.StateType.HAS_QUARTER)
    }

    override fun ejectQuarter(machine: Machine) {
        println("please put in a quarter coin")
    }

    override fun turnCrank(machine: Machine) {
        println("please put in a quarter coin")
    }

    override fun dispense(machine: Machine) {
        println("please put in a quarter coin")
    }

    override fun getStateType() = State.StateType.NO_QUARTER
}
