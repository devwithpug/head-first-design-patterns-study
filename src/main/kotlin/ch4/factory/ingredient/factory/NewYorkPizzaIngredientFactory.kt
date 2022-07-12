package ch4.factory.ingredient.factory

import ch4.factory.ingredient.FreshClams
import ch4.factory.ingredient.Garlic
import ch4.factory.ingredient.MarinaraSauce
import ch4.factory.ingredient.Mushroom
import ch4.factory.ingredient.Onion
import ch4.factory.ingredient.RedPepper
import ch4.factory.ingredient.ReggianoCheese
import ch4.factory.ingredient.SlicedPepperoni
import ch4.factory.ingredient.ThinCrustDough

class NewYorkPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough() = ThinCrustDough()

    override fun createSauce() = MarinaraSauce()

    override fun createCheese() = ReggianoCheese()

    override fun createVeggies() = listOf(Garlic(), Onion(), Mushroom(), RedPepper())

    override fun createPepperoni() = SlicedPepperoni()

    override fun createClam() = FreshClams()
}
