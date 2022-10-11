package ch8.templatemethod

class Coffee : CaffeineBeverage() {

    override fun prepareRecipe() {
        boilWater()
        brewCoffeeGrinds()
        pourInCup()
        addSugarAndMilk()
    }

    fun brewCoffeeGrinds() {
        println("brewing coffee with a filter...")
    }

    fun addSugarAndMilk() {
        println("adding sugar and milk...")
    }
}
