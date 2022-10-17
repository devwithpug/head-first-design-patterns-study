package ch10.state

interface State {

    fun insertQuarter()
    fun ejectQuarter()
    fun turnCrank()
    fun dispense()
    fun getStateType(): StateType

    enum class StateType {
        SOLD_OUT, NO_QUARTER, HAS_QUARTER, SOLD
    }
}
