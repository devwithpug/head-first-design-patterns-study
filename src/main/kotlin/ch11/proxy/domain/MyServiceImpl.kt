package ch11.proxy.domain

import ch11.proxy.dto.RequestDto
import ch11.proxy.dto.ResponseDto

class MyServiceImpl: MyService {
    override fun doJob(requestDto: RequestDto): ResponseDto {
        println("do job...")
        return ResponseDto("${requestDto.uid}:${requestDto.desc} inserted.")
    }
}
