package com.example.tradesykmmrd

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HomePageTag (
    @SerialName("name"          ) var name         : String? = null,
    @SerialName("value"         ) var value        : String? = null,
    @SerialName("display_value" ) var displayValue : String? = null
)
