package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class VerificationStatus {
    @SerialName("pending")  PENDING,
    @SerialName("approved") APPROVED,
    @SerialName("rejected") REJECTED
}
