package com.patamii.cm.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class OrgType {
    @SerialName("ong")        ONG,
    @SerialName("entreprise") ENTREPRISE,
    @SerialName("commerce")   COMMERCE,
    @SerialName("autre")      AUTRE
}

@Serializable
data class Organisation(
    @SerialName("id")                   val id: String,
    @SerialName("org_name")             val orgName: String,
    @SerialName("org_type")             val orgType: OrgType,
    @SerialName("contact_person")       val contactPerson: String,
    @SerialName("registration_doc_url") val registrationDocUrl: String? = null,
    @SerialName("tax_doc_url")          val taxDocUrl: String? = null,
    @SerialName("other_doc_url")        val otherDocUrl: String? = null,
    @SerialName("sectors")              val sectors: List<String>,
    @SerialName("verification_status")  val verificationStatus: VerificationStatus = VerificationStatus.PENDING
)
