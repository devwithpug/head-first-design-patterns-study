package ch4.factory.ingredient.factory

import ch4.factory.ingredient.FrozenClams
import ch4.factory.ingredient.Garlic
import ch4.factory.ingredient.MozzarellaCheese
import ch4.factory.ingredient.Mushroom
import ch4.factory.ingredient.Onion
import ch4.factory.ingredient.PlumTomatoSauce
import ch4.factory.ingredient.RedPepper
import ch4.factory.ingredient.SlicedPepperoni
import ch4.factory.ingredient.VeryThickCrustDough

class OrdinaryPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough() = VeryThickCrustDough()

    override fun createSauce() = PlumTomatoSauce()

    override fun createCheese() = MozzarellaCheese()

    override fun createVeggies() = listOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni() = SlicedPepperoni()

    override fun createClam() = FrozenClams()
}
