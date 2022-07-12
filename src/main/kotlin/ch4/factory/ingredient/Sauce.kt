package ch4.factory.ingredient

sealed class Sauce(val name: String)

class MarinaraSauce : Sauce("marinara sauce")

class PlumTomatoSauce : Sauce("plum tomato sauce")
