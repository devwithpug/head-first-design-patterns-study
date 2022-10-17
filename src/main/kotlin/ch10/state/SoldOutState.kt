package ch10.state

import ch10.Machine

class SoldOutState : State {
    override fun insertQuarter(machine: Machine) {
        println("sold out")
    }

    override fun ejectQuarter(machine: Machine) {
        println("there are no quarter coin in machine")
    }

    override fun turnCrank(machine: Machine) {
        println("sold out")
    }

    override fun dispense(machine: Machine) {
        println("sold out")
    }
    override fun getStateType() = State.StateType.SOLD_OUT
}
