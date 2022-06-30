package ch1.simuduck

open class Duck {
    fun quack() {
        println("quack")
    }

    fun swim() {
        println("swim")
    }

    open fun display() {
        println("duck")
    }
}
