package ch6.command.command

import ch6.command.Command
import ch6.command.domain.GarageDoor

class GarageDoorCloseCommand(private val garageDoor: GarageDoor) : Command {
    override fun execute() {
        garageDoor.down()
    }
}
