package com.example.plugins

import com.example.model.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        // tipos de moedas (nome, acrônimo, símbolo, imagem da bandeira do país)
        get("/currency_types") {
            call.respond(
                CurrencyTypesResult(
                    values = currencyTypes
                )
            )
        }

        // conversão de valores, moeda atual => moeda alvo, taxa de conversão entre essas moedas
        // obs: 'from' e 'to' serão os acrônimos de cada moeda
        get("/exchange_rate/{from}/{to}") {
            val from = call.parameters["from"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possível obter o acrônimo da moeda atual."
            )
            val to = call.parameters["to"]?.uppercase() ?: return@get call.respondText(
                status = HttpStatusCode.BadRequest,
                text = "Não foi possível obter o acrônimo da moeda alvo."
            )

            call.respond(
                ExchangeRateResult(
                    from = from.orUnknown(),
                    to = to.orUnknown(),
                    exchangeRate = exchangeRates[from]?.get(to).orZero()
                )
            )
        }
    }
}
