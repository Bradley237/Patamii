package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class NotificationType {
    @SerialName("job_request")  JOB_REQUEST,
    @SerialName("job_update")   JOB_UPDATE,
    @SerialName("new_message")  NEW_MESSAGE,
    @SerialName("verification") VERIFICATION
}

@Serializable
data class Notification(
    @SerialName("id")         val id: String,
    @SerialName("user_id")    val userId: String,
    @SerialName("type")       val type: NotificationType,
    @SerialName("title")      val title: String,
    @SerialName("body")       val body: String,
    @SerialName("is_read")    val isRead: Boolean = false,
    @SerialName("created_at") val createdAt: String? = null
)
