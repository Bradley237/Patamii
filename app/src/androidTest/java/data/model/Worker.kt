package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Worker(
    @SerialName("id")                  val id: String,
    @SerialName("trade")               val trade: String,
    @SerialName("years_experience")    val yearsExperience: Int? = null,
    @SerialName("profile_photo_url")   val profilePhotoUrl: String? = null,
    @SerialName("cni_front_url")       val cniFrontUrl: String? = null,
    @SerialName("cni_back_url")        val cniBackUrl: String? = null,
    @SerialName("zones_served")        val zonesServed: List<String>? = null,
    @SerialName("is_available")        val isAvailable: Boolean = true,
    @SerialName("verification_status") val verificationStatus: VerificationStatus = VerificationStatus.PENDING,
    @SerialName("rating")              val rating: Double = 0.0,
    @SerialName("total_jobs")          val totalJobs: Int = 0
)
