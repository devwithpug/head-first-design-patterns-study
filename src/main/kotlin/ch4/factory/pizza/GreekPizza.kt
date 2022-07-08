package ch4.factory.pizza

sealed class GreekPizza(
    style: String,
    dough: String,
    sauce: String,
    toppings: List<String> = emptyList()
) : OrdinaryPizza(
    name = "$style style greek pizza",
    dough = dough,
    sauce = sauce,
    toppings = toppings
)

class OrdinaryGreekPizza : GreekPizza(
    style = "ordinary",
    dough = "foo dough",
    sauce = "bar sauce"
)

class ItalyStyleGreekPizza : GreekPizza(
    style = "italy",
    dough = "foo dough",
    sauce = "bar sauce"
)

class NewYorkStyleGreekPizza : GreekPizza(
    style = "new york",
    dough = "foo dough",
    sauce = "bar sauce"
)

class ChicagoStyleGreekPizza : GreekPizza(
    style = "chicago",
    dough = "foo dough",
    sauce = "bar sauce"
)
