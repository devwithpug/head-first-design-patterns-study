package ch10.state

import ch10.Machine

class SoldOutState(
    private val machine: Machine
) : State {
    override fun insertQuarter() {
        println("sold out")
    }

    override fun ejectQuarter() {
        println("there are no quarter coin in machine")
    }

    override fun turnCrank() {
        println("sold out")
    }

    override fun dispense() {
        println("sold out")
    }
    override fun getStateType() = State.StateType.SOLD_OUT
}
