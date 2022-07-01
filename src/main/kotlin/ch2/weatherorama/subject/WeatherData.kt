package ch2.weatherorama.subject

import ch2.weatherorama.observer.Observer
import kotlin.random.Random

class WeatherData : Subject<WeatherDto> {

    private val observers: MutableList<Observer<WeatherDto>> = mutableListOf()

    private fun getTemperature() = randomDouble()

    private fun getHumidity() = randomDouble()

    private fun getPressure() = randomDouble()

    fun measurementsChanged() {
        val temperature = getTemperature()
        val humidity = getHumidity()
        val pressure = getPressure()

        notifyObservers(
            WeatherDto(
                temperature = temperature,
                humidity = humidity,
                pressure = pressure
            )
        )
    }

    override fun registerObserver(observer: Observer<WeatherDto>) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer<WeatherDto>) {
        observers.remove(observer)
    }

    override fun notifyObservers(value: WeatherDto) {
        observers.forEach { it.update(value) }
    }

    private fun randomDouble() = Random.nextDouble(DEFAULT_THRESHOLD)

    companion object {
        private const val DEFAULT_THRESHOLD = 10.0
    }
}
