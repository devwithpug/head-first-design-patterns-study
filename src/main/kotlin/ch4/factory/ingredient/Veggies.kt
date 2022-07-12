package ch4.factory.ingredient

sealed class Veggies(val name: String)

class Garlic : Veggies("garlic")

class Onion : Veggies("onion")

class Mushroom : Veggies("mushroom")

class RedPepper : Veggies("red pepper")

class EggPlant : Veggies("egg plant")

class Spinach : Veggies("spinach")

class BlackOlives : Veggies("black olives")
