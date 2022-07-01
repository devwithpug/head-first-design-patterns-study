package ch2.weatherorama.observer

import ch2.weatherorama.subject.WeatherData
import ch2.weatherorama.subject.WeatherDto

class CurrentConditionsDisplay(
    private val weatherData: WeatherData
) : DisplayElement, Observer<WeatherDto> {

    private var weather: WeatherDto? = null

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        weather
            ?.let { println("currentCondition: $weather") }
            ?: println("not updated yet")
    }

    override fun update(value: WeatherDto) {
        weather = value
        display()
    }

    override fun leave() {
        weatherData.removeObserver(this)
    }
}
