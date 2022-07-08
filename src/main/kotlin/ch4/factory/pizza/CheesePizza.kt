package ch4.factory.pizza

sealed class CheesePizza(style: String) : OrdinaryPizza(name = "$style style cheese pizza")

class OrdinaryCheesePizza : CheesePizza(style = "ordinary")

class ItalyStyleCheesePizza : CheesePizza(style = "italy")

class NewYorkStyleCheesePizza : CheesePizza(style = "new york")

class ChicagoStyleCheesePizza : CheesePizza(style = "chicago")
