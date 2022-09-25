package ch6.command

import ch6.command.domain.CeilingLight
import ch6.command.domain.GarageDoor
import ch6.command.domain.GardenLight
import ch6.command.domain.OutdoorLight
import ch6.command.domain.Sprinkler
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class RemoteControlTest {

    @Test
    fun `RemoteControl 테스트`() {
        val remote = RemoteControl()

        val ceilingLight = CeilingLight()
        val gardenLight = GardenLight()
        val outdoorLight = OutdoorLight()
        val garageDoor = GarageDoor()

        remote.setCommand(slot = 0, on = { ceilingLight.on() }, off = { ceilingLight.off() })
        remote.setCommand(slot = 1, on = { gardenLight.on() }, off = { gardenLight.off() })
        remote.setCommand(slot = 2, on = { outdoorLight.on() }, off = { outdoorLight.off() })
        remote.setCommand(slot = 3, on = { garageDoor.up() }, off = { garageDoor.down() })

        remote.onButtonWasPushed(0)
        remote.onButtonWasPushed(1)
        remote.onButtonWasPushed(2)
        remote.onButtonWasPushed(3)

        remote.offButtonWasPushed(0)
        remote.offButtonWasPushed(1)
        remote.offButtonWasPushed(2)
        remote.offButtonWasPushed(3)

        assertThrows<UnsupportedOperationException> { remote.onButtonWasPushed(5) }
    }

    @Test
    fun `undoCommand 테스트`() {
        val remote = RemoteControl()

        val sprinkler = Sprinkler()

        remote.setCommand(slot = 0, on = { sprinkler.waterOn() }, off = { sprinkler.waterOff() })

        remote.onButtonWasPushed(0)
        remote.offButtonWasPushed(0)
        remote.undoButtonWasPushed()
    }
}
