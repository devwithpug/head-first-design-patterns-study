package ch2.observer.observer

import ch2.observer.subject.WeatherData
import ch2.observer.subject.WeatherDto

class ForecastDisplay(
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
