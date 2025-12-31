package org.example.parsing.serializables

import kotlinx.serialization.Serializable

@Serializable
data class Timeline (
    val semanticSegments: List<SemanticSegment> = emptyList(),
)

@Serializable
data class SemanticSegment (
    val startTime: String,
    val endTime: String,
    val startTimeTimezoneUtcOffsetMinutes: Int? = null,
    val endTimeZoneUtcOffsetMinutes: Int? = null,

    val timelinePath: TimelinePath? = null,
    val visit: Visit? = null,
    val activity: Activity? = null,
)

@Serializable
data class Visit (
    val hierarchyLevel: Int? = null,
    val probability: Double? = null,
    val topCandidate: PlaceCandidate? = null,
)

@Serializable
data class PlaceCandidate (
    val placeId: String? = null,
    val semanticType: String? = null,
    val probability: Double? = null,
    val placeLocation: PlaceLocation? = null,
)

@Serializable
data class PlaceLocation (
    val latLng: String,
)

@Serializable
data class Activity(
    val start: ActivityLocation? = null,
    val end: ActivityLocation? = null,

    val distanceMeters: Double? = null,
    val topCandidate: ActivityCandidate? = null,
) {
}

@Serializable
data class ActivityLocation(
    val latLng: String?
)

@Serializable
data class ActivityCandidate(
    val type: String? = null,
    val probability: Double? = null,
)

@Serializable
data class TimelinePath(
    val point: String,
    val time: String,
) {
}