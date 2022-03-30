package com.example.tradesykmmrd

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthenticationToken(
    @SerialName("access_token") val accessToken: String? = null,
    @SerialName("refresh_token") val refreshToken: String? = null,
    @SerialName("token_type") val tokenType: String? = null,
    @SerialName("scope") val scope: String? = null,
    @SerialName("expiration_date") val expirationDate: String? = null,
) {
    override fun toString(): String {
        val sb = StringBuilder()

        sb.append("accessToken=").append(accessToken).append("\n")
        sb.append("refreshToken=").append(refreshToken).append("\n")
        sb.append("tokenType=").append(tokenType).append("\n")
        sb.append("scope=").append(scope).append("\n")
        sb.append("expirationDate=").append(expirationDate).append("\n")

        return sb.toString()
    }
}