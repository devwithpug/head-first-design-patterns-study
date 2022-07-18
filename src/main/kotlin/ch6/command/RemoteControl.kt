package ch6.command

import ch6.command.command.NoCommand

class RemoteControl {

    private val onCommands = Array<Command>(size = REMOTE_CONTROL_SLOT_SIZE) { NoCommand() }
    private val offCommands = Array<Command>(size = REMOTE_CONTROL_SLOT_SIZE) { NoCommand() }

    fun setCommand(slot: Int, on: Command, off: Command) {
        onCommands[slot] = on
        offCommands[slot] = off
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
    }

    companion object {
        private const val REMOTE_CONTROL_SLOT_SIZE = 7
    }
}
