package ch6.command

class SimpleRemoteControl {

    lateinit var slot: Command

    fun buttonWasPressed() {
        slot.execute()
    }
}
