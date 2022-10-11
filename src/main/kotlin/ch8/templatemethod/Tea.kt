package ch8.templatemethod

class Tea : CaffeineBeverage() {

    override fun prepareRecipe() {
        boilWater()
        steepTeaBag()
        pourInCup()
        addLemon()
    }

    fun steepTeaBag() {
        println("steeping tea bag...")
    }

    fun addLemon() {
        println("adding lemon...")
    }
}
