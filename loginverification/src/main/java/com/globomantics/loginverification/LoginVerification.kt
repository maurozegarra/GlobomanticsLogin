package com.globomantics.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "test@globomantics.com" &&
                password == "test123") ||
                (email == "admin@globomantics.com" &&
                        password == "admin123")
    }
}