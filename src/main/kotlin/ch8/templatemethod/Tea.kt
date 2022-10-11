package ch8.templatemethod

class Tea : CaffeineBeverage() {

    override fun brew() {
        println("steeping tea bag...")
    }

    override fun addCondiments() {
        println("adding lemon...")
    }

    override fun customerWantsCondiments(): Boolean {
        return (0..9).random() % 2 == 0
    }
}
