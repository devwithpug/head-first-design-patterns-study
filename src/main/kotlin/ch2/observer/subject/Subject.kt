package ch2.observer.subject

import ch2.observer.observer.Observer

interface Subject<T> {

    fun registerObserver(observer: Observer<T>)

    fun removeObserver(observer: Observer<T>)

    fun notifyObservers(value: T)
}
