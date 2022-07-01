package ch2.weatherorama

class WeatherData(
    private val currentConditionsDisplay: CurrentConditionsDisplay,
    private val statisticsDisplay: StatisticsDisplay,
    private val forecastDisplay: ForecastDisplay
) {

    private val temperature: Double
        get() = getTemperatureFromSource()
    private val humidity: Double
        get() = getHumidityFromSource()
    private val pressure: Double
        get() = getPressureFromSource()

    private fun getTemperatureFromSource(): Double = throw NotImplementedError()
    private fun getHumidityFromSource(): Double = throw NotImplementedError()
    private fun getPressureFromSource(): Double = throw NotImplementedError()

    fun measurementsChanged() {
        currentConditionsDisplay.update(temperature, humidity, pressure)
        statisticsDisplay.update(temperature, humidity, pressure)
        forecastDisplay.update(temperature, humidity, pressure)
    }
}
