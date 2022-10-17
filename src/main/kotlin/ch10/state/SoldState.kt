package ch10.state

import ch10.Machine

class SoldState(
    private val machine: Machine
) : State {
    override fun insertQuarter() {
        println("dispensing ball...")
    }

    override fun ejectQuarter() {
        println("a quarter coin ejected already")
    }

    override fun turnCrank() {
        println("please turn the cranks once")
    }

    override fun dispense() {
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
