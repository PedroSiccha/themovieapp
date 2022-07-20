package com.pedro.themovieapp.model

class UserProvider {

    companion object {

        fun login(userName: String, password: String): Boolean{
            var isLogin: Boolean = false
            if (userName == "Admin" && password == "Password123"){
                isLogin = true
            }
            return isLogin
        }

    }


}