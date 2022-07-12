package ch4.factory.ingredient.factory

import ch4.factory.ingredient.BlackOlives
import ch4.factory.ingredient.EggPlant
import ch4.factory.ingredient.FrozenClams
import ch4.factory.ingredient.MozzarellaCheese
import ch4.factory.ingredient.PlumTomatoSauce
import ch4.factory.ingredient.SlicedPepperoni
import ch4.factory.ingredient.Spinach
import ch4.factory.ingredient.VeryThickCrustDough

class ChicagoPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough() = VeryThickCrustDough()

    override fun createSauce() = PlumTomatoSauce()

    override fun createCheese() = MozzarellaCheese()

    override fun createVeggies() = listOf(BlackOlives(), Spinach(), EggPlant())

    override fun createPepperoni() = SlicedPepperoni()

    override fun createClam() = FrozenClams()
}
