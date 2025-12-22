package org.example.parsing.serializables

import kotlinx.serialization.Serializable

@Serializable
data class Activity(
    val start: ActivityLocation? = null,
    val end: ActivityLocation? = null,

    val distanceMeters: Double? = null,
    val topCandidate: Candidate? = null,
) {
}

@Serializable
data class ActivityLocation(
    val latLng: String?
)

@Serializable
data class Candidate(
    val type: String? = null,
    val probability: Double? = null,
)

