package com.rocketseat.conversor.moedas.api

import com.rocketseat.conversor.moedas.api.plugins.configureRouting
import com.rocketseat.conversor.moedas.api.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
}
