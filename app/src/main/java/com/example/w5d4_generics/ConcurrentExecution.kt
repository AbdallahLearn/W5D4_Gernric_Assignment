package com.example.w5d4_generics

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking



// Concurrent Execution
fun concurrentExecution() {
    runBlocking {
        val userDataDeferred = async(Dispatchers.IO) {
            try {
                fetchUserData()
            } catch (e: Exception) {
                "Error: ${e.message}"
            }
        }

        val userSettingsDeferred = async(Dispatchers.IO) {
            try {
                fetchUserSettings()
            } catch (e: Exception) {
                "Error: ${e.message}"
            }
        }

        val userPreferencesDeferred = async(Dispatchers.IO) {
            try {
                fetchUserPreferences()
            } catch (e: Exception) {
                "Error: ${e.message}"
            }
        }

        // Wait for all results
        val userData = userDataDeferred.await()
        val userSettings = userSettingsDeferred.await()
        val userPreferences = userPreferencesDeferred.await()

        println("Concurrent - User Data: $userData")
        println("Concurrent - User Settings: $userSettings")
        println("Concurrent - User Preferences: $userPreferences")
    }
}