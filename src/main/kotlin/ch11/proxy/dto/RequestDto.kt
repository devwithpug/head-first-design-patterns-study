package ch11.proxy.dto

import java.io.Serializable

data class RequestDto(
    val uid: Int,
    val desc: String
) : Serializable
