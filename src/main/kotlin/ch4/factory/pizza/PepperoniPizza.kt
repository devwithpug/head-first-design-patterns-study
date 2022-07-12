package ch4.factory.pizza

import ch4.factory.ingredient.factory.ChicagoPizzaIngredientFactory
import ch4.factory.ingredient.factory.ItalyPizzaIngredientFactory
import ch4.factory.ingredient.factory.NewYorkPizzaIngredientFactory
import ch4.factory.ingredient.factory.OrdinaryPizzaIngredientFactory
import ch4.factory.ingredient.factory.PizzaIngredientFactory

sealed class PepperoniPizza(
    style: String,
    ingredientFactory: PizzaIngredientFactory
) : Pizza(
    name = "$style style cheese pizza",
    ingredientFactory = ingredientFactory
)

class OrdinaryPepperoniPizza : PepperoniPizza(
    style = "ordinary",
    ingredientFactory = OrdinaryPizzaIngredientFactory()
)

class ItalyStylePepperoniPizza : PepperoniPizza(
    style = "italy",
    ingredientFactory = ItalyPizzaIngredientFactory()
)

class NewYorkStylePepperoniPizza : PepperoniPizza(
    style = "new york",
    ingredientFactory = NewYorkPizzaIngredientFactory()
)

class ChicagoStylePepperoniPizza : PepperoniPizza(
    style = "chicago",
    ingredientFactory = ChicagoPizzaIngredientFactory()
)
