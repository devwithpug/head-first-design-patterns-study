package ch4.factory.pizza

sealed class PepperoniPizza(style: String = "ordinary") : OrdinaryPizza(name = "$style style pepperoni pizza")

class OrdinaryPepperoniPizza : PepperoniPizza(style = "ordinary")

class ItalyStylePepperoniPizza : PepperoniPizza(style = "italy")

class NewYorkStylePepperoniPizza : PepperoniPizza(style = "new york")

class ChicagoStylePepperoniPizza : PepperoniPizza(style = "chicago")
