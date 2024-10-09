package com.rocketseat.conversor.moedas.api.model

import kotlinx.serialization.Serializable

@Serializable
data class CurrencyType(
    val name: String,
    val acronym: String,
    val symbol: String,
    val countryFlagImageUrl: String
)

@Serializable
data class CurrencyTypesResult(
    val values: List<CurrencyType>
)

// Script IA: Retorne uma lista com os 10 tipos mais comuns de moedas do mundo (inclua o real brasileiro)
// na linguagem Kotlin, estruturando na data class:
// data class CurrencyType(
//    val name: String,
//    val acronym: String,
//    val symbol: String,
//    val countryFlagImageUrl: String
// )

val currencyTypes = listOf(
    CurrencyType(
        acronym = "USD",
        name = "Dólar Americano",
        symbol = "$",
        countryFlagImageUrl = "https://flagcdn.com/us.svg"
    ),      // USA
    CurrencyType(
        acronym = "EUR",
        name = "Euro",
        symbol = "€",
        countryFlagImageUrl = "https://flagcdn.com/eu.svg"
    ),                 // European Union
    CurrencyType(
        acronym = "JPY",
        name = "Iene Japonês",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/jp.svg"
    ),         // Japan
    CurrencyType(
        acronym = "GBP",
        name = "Libra Esterlina",
        symbol = "£",
        countryFlagImageUrl = "https://flagcdn.com/gb.svg"
    ),      // United Kingdom
    CurrencyType(
        acronym = "CNY",
        name = "Yuan Chinês",
        symbol = "¥",
        countryFlagImageUrl = "https://flagcdn.com/cn.svg"
    ),          // China
    CurrencyType(
        acronym = "BRL",
        name = "Real Brasileiro",
        symbol = "R$",
        countryFlagImageUrl = "https://flagcdn.com/br.svg"
    ),     // Brazil
)

