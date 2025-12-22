package org.example.parsing.serializables

import kotlinx.serialization.Serializable

@Serializable
data class Timeline (
    val semanticSegments: List<SemanticSegment> = emptyList(),
)