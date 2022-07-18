package ch6.command

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
