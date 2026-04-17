package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Message(
    @SerialName("id")         val id: String,
    @SerialName("job_id")     val jobId: String,
    @SerialName("sender_id")  val senderId: String,
    @SerialName("content")    val content: String,
    @SerialName("created_at") val createdAt: String? = null
)
