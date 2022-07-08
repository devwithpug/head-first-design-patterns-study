package ch4.factory.pizza

sealed class PepperoniPizza(
    style: String,
    dough: String,
    sauce: String,
    toppings: List<String> = emptyList()
) : OrdinaryPizza(
    name = "$style style pepperoni pizza",
    dough = dough,
    sauce = sauce,
    toppings = toppings
)

class OrdinaryPepperoniPizza : PepperoniPizza(
    style = "ordinary",
    dough = "foo dough",
    sauce = "bar sauce"
)

class ItalyStylePepperoniPizza : PepperoniPizza(
    style = "italy",
    dough = "foo dough",
    sauce = "bar sauce"
)

class NewYorkStylePepperoniPizza : PepperoniPizza(
    style = "new york",
    dough = "foo dough",
    sauce = "bar sauce"
)

class ChicagoStylePepperoniPizza : PepperoniPizza(
    style = "chicago",
    dough = "foo dough",
    sauce = "bar sauce"
)
