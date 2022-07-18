package ch6.command

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
