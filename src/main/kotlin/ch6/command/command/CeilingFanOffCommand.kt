package ch6.command.command

import ch6.command.Command
import ch6.command.domain.CeilingFan

class CeilingFanOffCommand(private val ceilingFan: CeilingFan) : Command {
    override fun execute() {
        ceilingFan.off()
    }
}
