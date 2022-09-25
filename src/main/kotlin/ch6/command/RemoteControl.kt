package ch6.command

class RemoteControl {

    private val onCommands = Array(size = REMOTE_CONTROL_SLOT_SIZE) { { noCommand() } }
    private val offCommands = Array(size = REMOTE_CONTROL_SLOT_SIZE) { { noCommand() } }
    private var undoCommand = { noCommand() }

    fun setCommand(slot: Int, on: () -> Unit, off: () -> Unit) {
        onCommands[slot] = on
        offCommands[slot] = off
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot]()
        undoCommand = offCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot]()
        undoCommand = onCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand()
    }

    private fun noCommand(): Unit = throw UnsupportedOperationException("NO COMMAND")

    companion object {
        private const val REMOTE_CONTROL_SLOT_SIZE = 7
    }
}
