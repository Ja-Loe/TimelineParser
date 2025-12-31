package org.example.parsing

import kotlinx.serialization.json.Json

val timelineJson = Json {
    ignoreUnknownKeys = true
    isLenient = true
}