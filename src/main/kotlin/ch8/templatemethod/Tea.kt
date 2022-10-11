package ch8.templatemethod

class Tea {

    fun prepareRecipe() {
        boilWater()
        steepTeaBag()
        pourInCup()
        addLemon()
    }

    fun boilWater() {
        println("boiling water...")
    }

    fun steepTeaBag() {
        println("steeping tea bag...")
    }

    fun addLemon() {
        println("adding lemon...")
    }

    fun pourInCup() {
        println("pouring in a cup...")
    }
}
