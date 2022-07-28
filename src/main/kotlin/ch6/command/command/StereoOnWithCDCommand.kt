package ch6.command.command

import ch6.command.Command
import ch6.command.domain.Stereo

class StereoOnWithCDCommand(private val stereo: Stereo) : Command {
    override fun execute() {
        stereo.on()
        stereo.setCd()
        stereo.setVolume(100)
    }
}
