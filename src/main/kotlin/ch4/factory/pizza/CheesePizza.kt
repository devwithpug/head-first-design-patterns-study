package ch4.factory.pizza

sealed class CheesePizza(
    style: String,
    dough: String,
    sauce: String,
    toppings: List<String> = emptyList()
) : OrdinaryPizza(
    name = "$style style cheese pizza",
    dough = dough,
    sauce = sauce,
    toppings = toppings
)

class OrdinaryCheesePizza : CheesePizza(
    style = "ordinary",
    dough = "thin crust dough",
    sauce = "marinara sauce",
    toppings = listOf("reggiano cheese")
)

class ItalyStyleCheesePizza : CheesePizza(
    style = "italy",
    dough = "a very thick crust dough",
    sauce = "plum tomato sauce",
    toppings = listOf("mozzarella cheese")
) {
    override fun cut() {
        println("cut $name into squares...")
    }
}

class NewYorkStyleCheesePizza : CheesePizza(
    style = "new york",
    dough = "foo dough",
    sauce = "bar sauce"
)

class ChicagoStyleCheesePizza : CheesePizza(
    style = "chicago",
    dough = "foo dough",
    sauce = "bar sauce"
)
