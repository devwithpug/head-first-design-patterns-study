package ch6.command

import ch6.command.command.GarageDoorCloseCommand
import ch6.command.command.GarageDoorOpenCommand
import ch6.command.command.LightOffCommand
import ch6.command.command.LightOnCommand
import ch6.command.domain.CeilingLight
import ch6.command.domain.GarageDoor
import ch6.command.domain.GardenLight
import ch6.command.domain.OutdoorLight
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class RemoteControlTest {

    @Test
    fun `RemoteControl 테스트`() {
        val remote = RemoteControl()

        val ceilingLight = CeilingLight()
        val ceilingLightOn = LightOnCommand(ceilingLight)
        val ceilingLightOff = LightOffCommand(ceilingLight)

        val gardenLight = GardenLight()
        val gardenLightOn = LightOnCommand(gardenLight)
        val gardenLightOff = LightOffCommand(gardenLight)

        val outdoorLight = OutdoorLight()
        val outdoorLightOn = LightOnCommand(outdoorLight)
        val outdoorLightOff = LightOffCommand(outdoorLight)

        val garageDoor = GarageDoor()
        val garageDoorOpen = GarageDoorOpenCommand(garageDoor)
        val garageDoorClose = GarageDoorCloseCommand(garageDoor)

        remote.setCommand(0, ceilingLightOn, ceilingLightOff)
        remote.setCommand(1, gardenLightOn, gardenLightOff)
        remote.setCommand(2, outdoorLightOn, outdoorLightOff)
        remote.setCommand(3, garageDoorOpen, garageDoorClose)

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
}
