package ch4.factory.ingredient.factory

import ch4.factory.ingredient.BlackOlives
import ch4.factory.ingredient.FreshClams
import ch4.factory.ingredient.Garlic
import ch4.factory.ingredient.MarinaraSauce
import ch4.factory.ingredient.MozzarellaCheese
import ch4.factory.ingredient.Onion
import ch4.factory.ingredient.SlicedPepperoni
import ch4.factory.ingredient.Spinach
import ch4.factory.ingredient.ThinCrustDough

class ItalyPizzaIngredientFactory : PizzaIngredientFactory {

    override fun createDough() = ThinCrustDough()

    override fun createSauce() = MarinaraSauce()

    override fun createCheese() = MozzarellaCheese()

    override fun createVeggies() = listOf(Spinach(), BlackOlives(), Garlic(), Onion())

    override fun createPepperoni() = SlicedPepperoni()

    override fun createClam() = FreshClams()
}
