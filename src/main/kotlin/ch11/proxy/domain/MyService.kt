package ch11.proxy.domain

import ch11.proxy.dto.RequestDto
import ch11.proxy.dto.ResponseDto
import java.rmi.Remote
import java.rmi.RemoteException

interface MyService : Remote {
    @Throws(RemoteException::class)
    fun doJob(requestDto: RequestDto): ResponseDto
}
