package ch2.observer.observer

interface Observer<T> {
    fun update(value: T)

    fun leave()
}
