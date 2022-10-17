package ch10.state

import ch10.Machine

class HasQuarterState : State {
    override fun insertQuarter(machine: Machine) {
        println("please put in a one quarter coin only")
    }

    override fun ejectQuarter(machine: Machine) {
        println("ejecting quarter coin...")
        machine.setState(State.StateType.NO_QUARTER)
    }

    override fun turnCrank(machine: Machine) {
        println("you turned the crank")
        machine.setState(State.StateType.SOLD)
    }

    override fun dispense(machine: Machine) {
        throw IllegalStateException()
    }

    override fun getStateType() = State.StateType.HAS_QUARTER
}
