package ch8.templatemethod

class Coffee : CaffeineBeverage() {

    override fun brew() {
        println("brewing coffee with a filter...")
    }

    override fun addCondiments() {
        println("brewing coffee with a filter...")
    }
}
