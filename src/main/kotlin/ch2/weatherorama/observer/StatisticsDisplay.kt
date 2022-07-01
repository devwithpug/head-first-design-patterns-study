package ch2.weatherorama.observer

import ch2.weatherorama.subject.WeatherData
import ch2.weatherorama.subject.WeatherDto

class StatisticsDisplay(
    private val weatherData: WeatherData
) : DisplayElement, Observer<WeatherDto> {

    private val weatherHistory: MutableList<WeatherDto> = mutableListOf()

    init {
        weatherData.registerObserver(this)
    }

    override fun display() {
        val averageTemperature = weatherHistory.map { it.temperature }.average()
        val averageHumidity = weatherHistory.map { it.humidity }.average()
        val averagePressure = weatherHistory.map { it.pressure }.average()

        println(
            """
            average temperature: $averageTemperature
            average humidity: $averageHumidity
            average pressure: $averagePressure
            """.trimIndent()
        )
    }

    override fun update(value: WeatherDto) {
        weatherHistory.add(value)
        display()
    }

    override fun leave() {
        weatherData.removeObserver(this)
    }
}
