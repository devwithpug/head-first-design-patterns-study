package ch11.proxy

import java.rmi.Remote
import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject

inline fun <reified T : Remote> publish(port: Int, obj: T) {
    LocateRegistry.createRegistry(port).bind(T::class.simpleName, UnicastRemoteObject.exportObject(obj, 0))
}

inline fun <reified T : Remote> consume(host: String, port: Int): T {
    return LocateRegistry.getRegistry(host, port).lookup(T::class.simpleName) as T
}
