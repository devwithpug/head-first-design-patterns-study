package ch4.factory.pizza

sealed class GreekPizza(style: String) : OrdinaryPizza(name = "$style style greek pizza")

class OrdinaryGreekPizza : GreekPizza(style = "ordinary")

class ItalyStyleGreekPizza : GreekPizza(style = "italy")

class NewYorkStyleGreekPizza : GreekPizza(style = "new york")

class ChicagoStyleGreekPizza : GreekPizza(style = "chicago")
