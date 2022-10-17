package ch10.state

import ch10.Machine

class SoldState : State {
    override fun insertQuarter(machine: Machine) {
        println("dispensing ball...")
    }

    override fun ejectQuarter(machine: Machine) {
        println("a quarter coin ejected already")
    }

    override fun turnCrank(machine: Machine) {
        println("please turn the cranks once")
    }

    override fun dispense(machine: Machine) {
        machine.releaseBall()
        if (machine.getCount() > 0) {
            machine.setState(State.StateType.NO_QUARTER)
        } else {
            println("sold out")
            machine.setState(State.StateType.SOLD_OUT)
        }
    }

    override fun getStateType() = State.StateType.SOLD
}
