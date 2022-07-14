package ch5.singleton

class Singleton private constructor() {

    private val foo: String = "someVal"

    companion object {
        @Volatile
        private lateinit var uniqueInstance: Singleton

        fun getInstance(): Singleton {
            if (!this::uniqueInstance.isInitialized) {
                synchronized(Singleton::class) {
                    if (!this::uniqueInstance.isInitialized) {
                        uniqueInstance = Singleton()
                    }
                }
            }
            return uniqueInstance
        }
    }
}
