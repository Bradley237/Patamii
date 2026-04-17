package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class UserRole {
    @SerialName("client")       CLIENT,
    @SerialName("worker")       WORKER,
    @SerialName("organisation") ORGANISATION
}

@Serializable
data class User(
    @SerialName("id")            val id: String,
    @SerialName("phone")         val phone: String,
    @SerialName("email")         val email: String? = null,
    @SerialName("full_name")     val fullName: String,
    @SerialName("role")          val role: UserRole,
    @SerialName("city")          val city: String,
    @SerialName("neighbourhood") val neighbourhood: String? = null,
    @SerialName("is_verified")   val isVerified: Boolean = false,
    @SerialName("created_at")    val createdAt: String? = null
)
