package ch4.factory.pizza

import ch4.factory.ingredient.factory.ChicagoPizzaIngredientFactory
import ch4.factory.ingredient.factory.ItalyPizzaIngredientFactory
import ch4.factory.ingredient.factory.NewYorkPizzaIngredientFactory
import ch4.factory.ingredient.factory.OrdinaryPizzaIngredientFactory
import ch4.factory.ingredient.factory.PizzaIngredientFactory

sealed class CheesePizza(
    style: String,
    ingredientFactory: PizzaIngredientFactory
) : Pizza(
    name = "$style style cheese pizza",
    ingredientFactory = ingredientFactory
)

class OrdinaryCheesePizza : CheesePizza(
    style = "ordinary",
    ingredientFactory = OrdinaryPizzaIngredientFactory()
)

class ItalyStyleCheesePizza : CheesePizza(
    style = "italy",
    ingredientFactory = ItalyPizzaIngredientFactory()
) {
    override fun cut() {
        println("cut $name into squares...")
    }
}

class NewYorkStyleCheesePizza : CheesePizza(
    style = "new york",
    ingredientFactory = NewYorkPizzaIngredientFactory()
)

class ChicagoStyleCheesePizza : CheesePizza(
    style = "chicago",
    ingredientFactory = ChicagoPizzaIngredientFactory()
)
