package ch10

import ch10.State.HAS_QUARTER
import ch10.State.NO_QUARTER
import ch10.State.SOLD
import ch10.State.SOLD_OUT

class Machine(
    var count: Int
) {
    var state = SOLD_OUT

    init {
        if (count > 0) {
            state = NO_QUARTER
        }
    }

    fun insertQuarter() {
        when (state) {
            HAS_QUARTER -> println("please put in a one quarter coin only")
            SOLD_OUT -> println("sold out")
            SOLD -> println("dispensing ball...")
            NO_QUARTER -> {
                state = HAS_QUARTER
                println("putting in a quarter coin...")
            }
        }
    }

    fun ejectQuarter() {
        when (state) {
            SOLD_OUT -> println("there are no quarter coin in machine")
            SOLD -> println("a quarter coin ejected already")
            NO_QUARTER -> println("please put in a quarter coin")
            HAS_QUARTER -> {
                println("ejecting quarter coin...")
                state = NO_QUARTER
            }
        }
    }

    fun turnCrank() {
        when (state) {
            SOLD_OUT -> println("sold out")
            SOLD -> println("please turn the cranks once")
            NO_QUARTER -> println("please put in a quarter coin")
            HAS_QUARTER -> {
                println("you turned the crank")
                state = SOLD
                dispense()
            }
        }
    }

    private fun dispense() {
        when (state) {
            SOLD_OUT -> println("sold out")
            NO_QUARTER -> println("please put in a quarter coin")
            HAS_QUARTER -> throw IllegalStateException()
            SOLD -> {
                println("dispensing ball...")
                state = if (--count == 0) {
                    println("sold out")
                    SOLD_OUT
                } else {
                    NO_QUARTER
                }
            }
        }
    }

    override fun toString(): String {
        return "[Machine] count = $count, state = $state"
    }
}
