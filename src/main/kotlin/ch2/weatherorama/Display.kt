package ch2.weatherorama

interface Display {
    fun update(temp: Double, humidity: Double, pressure: Double)
}
