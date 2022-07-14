package ch5.singleton

class Singleton private constructor() {

    private val foo: String = "someVal"

    companion object {
        private lateinit var uniqueInstance: Singleton
        fun getInstance(): Singleton {
            if (!this::uniqueInstance.isInitialized) {
                uniqueInstance = Singleton()
            }
            return uniqueInstance
        }
    }
}
