package ch11.proxy

import ch11.proxy.domain.MyService
import ch11.proxy.domain.MyServiceImpl

object Server {
    @JvmStatic
    fun main(args: Array<String>) {
        publish<MyService>(4000, MyServiceImpl())
        println("Server started")
    }
}
