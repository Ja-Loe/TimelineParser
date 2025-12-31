package org.example.parsing.serializables

import kotlinx.serialization.Serializable

data class LatLng(
    val lat: Double,
    val lng: Double
)

fun String.toLatLng(): LatLng? {
    return try {
        val cleaned = this.replace("DEGREE", "")
        //TODO: Find degree sign in timelinefile to fix replace above
        val parts = cleaned.split(",").map {
            it.trim()
        }
        if (parts.size != 2) null
        else LatLng(parts[0].toDouble(), parts[1].toDouble())
        } catch (e: Exception) {
            null
    }
}