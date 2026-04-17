package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Review(
    @SerialName("id")         val id: String,
    @SerialName("job_id")     val jobId: String,
    @SerialName("client_id")  val clientId: String,
    @SerialName("worker_id")  val workerId: String,
    @SerialName("rating")     val rating: Int,       // 1–5
    @SerialName("comment")    val comment: String? = null,
    @SerialName("created_at") val createdAt: String? = null
)
