package com.example.tradesykmmrd

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomePageData(
    @SerialName("newArrivals" ) var newArrivals : Boolean?          = null,
    @SerialName("trend"       ) var trend       : ArrayList<String> = arrayListOf()
)
