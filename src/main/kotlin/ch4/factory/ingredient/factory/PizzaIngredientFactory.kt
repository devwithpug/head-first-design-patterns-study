package ch4.factory.ingredient.factory

import ch4.factory.ingredient.Cheese
import ch4.factory.ingredient.Clams
import ch4.factory.ingredient.Dough
import ch4.factory.ingredient.Pepperoni
import ch4.factory.ingredient.Sauce
import ch4.factory.ingredient.Veggies

interface PizzaIngredientFactory {

    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
    fun createPepperoni(): Pepperoni
    fun createClam(): Clams
}
