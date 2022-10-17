package ch10

import ch10.state.HasQuarterState
import ch10.state.NoQuarterState
import ch10.state.SoldOutState
import ch10.state.SoldState
import ch10.state.State
import ch10.state.State.StateType.HAS_QUARTER
import ch10.state.State.StateType.NO_QUARTER
import ch10.state.State.StateType.SOLD
import ch10.state.State.StateType.SOLD_OUT

class Machine(
    private var count: Int
) {
    private var state: State

    private val soldOutState = SoldOutState(this)
    private val noQuarterState = NoQuarterState(this)
    private val hasQuarterState = HasQuarterState(this)
    private val soldState = SoldState(this)

    init {
        state = if (count > 0) {
            noQuarterState
        } else {
            soldOutState
        }
    }

    fun insertQuarter() {
        state.insertQuarter()
    }

    fun ejectQuarter() {
        state.ejectQuarter()
    }

    fun turnCrank() {
        state.turnCrank()
        if (state is SoldState) {
            state.dispense()
        }
    }

    fun releaseBall() {
        println("dispensing ball...")
        if (count > 0) {
            count -= 1
        }
    }

    fun getCount() = count

    fun setState(stateType: State.StateType) {
        state = when (stateType) {
            SOLD_OUT -> soldOutState
            NO_QUARTER -> noQuarterState
            HAS_QUARTER -> hasQuarterState
            SOLD -> soldState
        }
    }

    fun getState(): State.StateType {
        return state.getStateType()
    }

    override fun toString(): String {
        return "[Machine] count = $count, state = $state"
    }
}
