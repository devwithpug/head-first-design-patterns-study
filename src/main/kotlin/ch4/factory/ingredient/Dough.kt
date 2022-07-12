package ch4.factory.ingredient

sealed class Dough(val name: String)

class ThinCrustDough : Dough("thin crust dough")

class VeryThickCrustDough : Dough("very thick crust dough")
