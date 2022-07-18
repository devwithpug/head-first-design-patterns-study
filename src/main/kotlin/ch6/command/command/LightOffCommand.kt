package ch6.command.command

import ch6.command.Command
import ch6.command.domain.Light

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
