package ch2.weatherorama.subject

import ch2.weatherorama.observer.CurrentConditionsDisplay
import ch2.weatherorama.observer.ForecastDisplay
import ch2.weatherorama.observer.StatisticsDisplay
import org.junit.jupiter.api.Test

internal class WeatherDataTest {

    @Test
    fun `Observer 패턴 테스트`() {
        // given
        val weatherData = WeatherData()

        val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
        val statisticsDisplay = StatisticsDisplay(weatherData)
        val forecastDisplay = ForecastDisplay(weatherData)

        // when & then
        weatherData.measurementsChanged()
    }
}
