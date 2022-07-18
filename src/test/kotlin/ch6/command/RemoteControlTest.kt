package ch6.command

import ch6.command.command.LightOnCommand
import ch6.command.domain.CeilingLight
import org.junit.jupiter.api.Test

internal class RemoteControlTest {

    @Test
    fun `lightOn 테스트`() {
        // given
        val remote = RemoteControl()
        val lightOn = LightOnCommand(CeilingLight())

        // when, then
        remote.slot = lightOn
        remote.buttonWasPressed()
    }
}
