package com.example.w5d4_generics


import kotlinx.coroutines.delay
import kotlin.random.Random

// Function 1: Simulate a network call
suspend fun fetchUserData(): String {
    delay(1000) // Simulate delay
    return if (Random.nextBoolean()) "User Data" else throw Exception("Network Error")
}

// Function 2: Simulate a database query
suspend fun fetchUserSettings(): String {
    delay(800) // Simulate delay
    return if (Random.nextBoolean()) "User Settings" else throw Exception("Database Error")
}

// Function 3: Simulate a file read operation
suspend fun fetchUserPreferences(): String {
    delay(600) // Simulate delay
    return if (Random.nextBoolean()) "User Preferences" else throw Exception("File Read Error")
}