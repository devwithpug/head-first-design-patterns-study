package ch11.proxy

import ch11.proxy.domain.MyService
import ch11.proxy.dto.RequestDto

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val myService = consume<MyService>("localhost", 4000)
        val request = RequestDto(uid = 1, desc = "hello-proxy")
        val response = myService.doJob(request)
        println(response)
    }
}
