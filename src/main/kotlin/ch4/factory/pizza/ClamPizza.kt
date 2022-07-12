package ch4.factory.pizza

import ch4.factory.ingredient.factory.ChicagoPizzaIngredientFactory
import ch4.factory.ingredient.factory.ItalyPizzaIngredientFactory
import ch4.factory.ingredient.factory.NewYorkPizzaIngredientFactory
import ch4.factory.ingredient.factory.OrdinaryPizzaIngredientFactory
import ch4.factory.ingredient.factory.PizzaIngredientFactory

sealed class ClamPizza(
    style: String,
    ingredientFactory: PizzaIngredientFactory
) : Pizza(
    name = "$style style cheese pizza",
    ingredientFactory = ingredientFactory
)

class OrdinaryClamPizza : ClamPizza(
    style = "ordinary",
    ingredientFactory = OrdinaryPizzaIngredientFactory()
)

class ItalyStyleClamPizza : ClamPizza(
    style = "italy",
    ingredientFactory = ItalyPizzaIngredientFactory()
) {
    override fun cut() {
        println("cut $name into squares...")
    }
}

class NewYorkStyleClamPizza : ClamPizza(
    style = "new york",
    ingredientFactory = NewYorkPizzaIngredientFactory()
)

class ChicagoStyleClamPizza : ClamPizza(
    style = "chicago",
    ingredientFactory = ChicagoPizzaIngredientFactory()
)
