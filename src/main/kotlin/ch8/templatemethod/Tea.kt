package ch8.templatemethod

class Tea : CaffeineBeverage() {

    override fun brew() {
        println("steeping tea bag...")
    }

    override fun addCondiments() {
        println("adding lemon...")
    }
}
