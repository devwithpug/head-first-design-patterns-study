package ch6.command.domain

class GarageDoor {
    fun up() {
        println("garage door was opened.")
    }
    fun down() {
        println("garage door was closed.")
    }
    fun stop() {
        println("garage door was stopped.")
    }
    fun lightOn() {
        println("garage door light ON")
    }
    fun lightOff() {
        println("garage door light OFF")
    }
}
