package ch10.state

import ch10.Machine

interface State {

    fun insertQuarter(machine: Machine)
    fun ejectQuarter(machine: Machine)
    fun turnCrank(machine: Machine)
    fun dispense(machine: Machine)
    fun getStateType(): StateType

    enum class StateType {
        SOLD_OUT, NO_QUARTER, HAS_QUARTER, SOLD
    }
}
