package ch4.factory.pizza

import ch4.factory.ingredient.Cheese
import ch4.factory.ingredient.Clams
import ch4.factory.ingredient.Dough
import ch4.factory.ingredient.Pepperoni
import ch4.factory.ingredient.Sauce
import ch4.factory.ingredient.Veggies
import ch4.factory.ingredient.factory.PizzaIngredientFactory

abstract class Pizza(
    val name: String,
    val ingredientFactory: PizzaIngredientFactory
) {
    lateinit var dough: Dough
    lateinit var sauce: Sauce
    lateinit var veggies: List<Veggies>
    lateinit var cheese: Cheese
    lateinit var pepperoni: Pepperoni
    lateinit var clams: Clams

    open fun prepare() {
        println("prepare $name...")
        dough = ingredientFactory.createDough()
        sauce = ingredientFactory.createSauce()
        veggies = ingredientFactory.createVeggies()
        cheese = ingredientFactory.createCheese()
        pepperoni = ingredientFactory.createPepperoni()
        clams = ingredientFactory.createClam()
    }

    open fun bake() {
        println("bake... $name")
    }

    open fun cut() {
        println("cut... $name")
    }

    open fun box() {
        println("box... $name")
    }
}
