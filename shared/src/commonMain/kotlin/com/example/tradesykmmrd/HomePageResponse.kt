package com.example.tradesykmmrd

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomePageResponse (
    @SerialName("homepage" ) var homepage : Homepage? = Homepage(),
    @SerialName("success"  ) var success  : Boolean?  = null,
    @SerialName("code"     ) var code     : String?   = null
)
