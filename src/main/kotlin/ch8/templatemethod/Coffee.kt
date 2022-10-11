package ch8.templatemethod

class Coffee {

    fun prepareRecipe() {
        boilWater()
        brewCoffeeGrinds()
        pourInCup()
        addSugarAndMilk()
    }

    fun boilWater() {
        println("boiling water...")
    }

    fun brewCoffeeGrinds() {
        println("brewing coffee with a filter...")
    }

    fun pourInCup() {
        println("pouring in a cup...")
    }

    fun addSugarAndMilk() {
        println("adding sugar and milk...")
    }
}
