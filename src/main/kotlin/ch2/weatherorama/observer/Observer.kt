package ch2.weatherorama.observer

interface Observer<T> {
    fun update(value: T)
}
