package ch6.command.domain

sealed class Light(private val location: String) {
    fun on() {
        println("$location light ON")
    }

    fun off() {
        println("$location light OFF")
    }
}

class CeilingLight : Light("ceiling")

class GardenLight : Light("garden")

class OutdoorLight : Light("outdoor")
