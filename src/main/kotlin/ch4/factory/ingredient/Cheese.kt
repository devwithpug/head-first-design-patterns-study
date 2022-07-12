package ch4.factory.ingredient

sealed class Cheese(val name: String)

class ReggianoCheese : Cheese("reggiano cheese")

class MozzarellaCheese : Cheese("mozzarella cheese")
