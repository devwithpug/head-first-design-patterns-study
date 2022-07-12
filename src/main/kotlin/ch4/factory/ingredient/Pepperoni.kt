package ch4.factory.ingredient

sealed class Pepperoni(val name: String)

class SlicedPepperoni : Pepperoni("sliced pepperoni")
