package ch4.factory.ingredient

sealed class Clams(val name: String)

class FreshClams : Clams("fresh clams")

class FrozenClams : Clams("frozen clams")
