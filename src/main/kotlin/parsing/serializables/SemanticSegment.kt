package org.example.parsing.serializables

import kotlinx.serialization.Serializable

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