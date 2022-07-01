package ch2.weatherorama.subject

import ch2.weatherorama.observer.Observer

interface Subject<T> {

    fun registerObserver(observer: Observer<T>)

    fun removeObserver(observer: Observer<T>)

    fun notifyObservers(value: T)
}
