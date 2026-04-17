package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class JobStatus {
    @SerialName("pending")   PENDING,
    @SerialName("active")    ACTIVE,
    @SerialName("completed") COMPLETED,
    @SerialName("cancelled") CANCELLED
}

@Serializable
data class Job(
    @SerialName("id")            val id: String,
    @SerialName("client_id")     val clientId: String,
    @SerialName("worker_id")     val workerId: String? = null,
    @SerialName("title")         val title: String,
    @SerialName("description")   val description: String? = null,
    @SerialName("status")        val status: JobStatus = JobStatus.PENDING,
    @SerialName("city")          val city: String,
    @SerialName("neighbourhood") val neighbourhood: String? = null,
    @SerialName("created_at")    val createdAt: String? = null
)
