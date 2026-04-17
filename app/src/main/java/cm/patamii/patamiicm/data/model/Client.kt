package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Client(
    @SerialName("id")              val id: String,
    @SerialName("preferred_zones") val preferredZones: List<String>? = null,
    @SerialName("total_bookings")  val totalBookings: Int = 0
)
