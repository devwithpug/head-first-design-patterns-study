package ch6.command

import ch6.command.command.LightOnCommand
import ch6.command.domain.Light
import org.junit.jupiter.api.Test

internal class SimpleRemoteControlTest {

    @Test
    fun `lightOn 테스트`() {
        // given
        val remote = SimpleRemoteControl()
        val light = Light()
        val lightOn = LightOnCommand(light)

        // when, then
        remote.slot = lightOn
        remote.buttonWasPressed()
    }
}
