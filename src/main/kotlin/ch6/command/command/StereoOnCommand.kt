package ch6.command.command

import ch6.command.Command
import ch6.command.domain.Stereo

class StereoOnCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
    }
}
