package ch4.factory.pizza

import ch4.factory.ingredient.factory.ChicagoPizzaIngredientFactory
import ch4.factory.ingredient.factory.ItalyPizzaIngredientFactory
import ch4.factory.ingredient.factory.NewYorkPizzaIngredientFactory
import ch4.factory.ingredient.factory.OrdinaryPizzaIngredientFactory
import ch4.factory.ingredient.factory.PizzaIngredientFactory

sealed class GreekPizza(
    style: String,
    ingredientFactory: PizzaIngredientFactory
) : Pizza(
    name = "$style style cheese pizza",
    ingredientFactory = ingredientFactory
)

class OrdinaryGreekPizza : GreekPizza(
    style = "ordinary",
    ingredientFactory = OrdinaryPizzaIngredientFactory()
)

class ItalyStyleGreekPizza : GreekPizza(
    style = "italy",
    ingredientFactory = ItalyPizzaIngredientFactory()
)

class NewYorkStyleGreekPizza : GreekPizza(
    style = "new york",
    ingredientFactory = NewYorkPizzaIngredientFactory()
)

class ChicagoStyleGreekPizza : GreekPizza(
    style = "chicago",
    ingredientFactory = ChicagoPizzaIngredientFactory()
)
