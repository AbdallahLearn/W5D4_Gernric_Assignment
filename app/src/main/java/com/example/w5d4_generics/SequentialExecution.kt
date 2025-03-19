package com.example.w5d4_generics


import kotlinx.coroutines.runBlocking

// Sequential Execution
fun sequentialExecution() {
    runBlocking {
        try {
            val userData = fetchUserData()
            println("Sequential - User Data: $userData")
        } catch (e: Exception) {
            println("Sequential - Error in fetchUserData: ${e.message}")
        }

        try {
            val userSettings = fetchUserSettings()
            println("Sequential - User Settings: $userSettings")
        } catch (e: Exception) {
            println("Sequential - Error in fetchUserSettings: ${e.message}")
        }

        try {
            val userPreferences = fetchUserPreferences()
            println("Sequential - User Preferences: $userPreferences")
        } catch (e: Exception) {
            println("Sequential - Error in fetchUserPreferences: ${e.message}")
        }
    }
}