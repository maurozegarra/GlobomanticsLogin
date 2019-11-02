package com.globomantics.loginverification

class LoginVerification {
    fun verifyCredentials(email: String, password: String): Boolean {
        return (email == "test@globomantics.com" &&
                password == "test1234") ||
                (email == "admin@globomantics.com" &&
                        password == "admin1234")
    }
}