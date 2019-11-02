package com.globomantics.loginverification

class LoginVerification {
    fun verifyEmailAndPassword(email: String, password: String): Boolean {
        return email == "test@globomantics.com" &&
                password == "test123"
    }
}