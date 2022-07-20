package com.pedro.themovieapp.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedro.themovieapp.model.MovieModel
import com.pedro.themovieapp.model.MovieProvider
import com.pedro.themovieapp.model.UserModel
import com.pedro.themovieapp.model.UserProvider

class LoginViewModel : ViewModel() {

    val userModel = MutableLiveData<Boolean>()

    fun login(username: String, password: String, context: Context){
        val currentLogin: Boolean = UserProvider.login(username, password)
        if (currentLogin){
            Toast.makeText(context, "Login Correcto", Toast.LENGTH_LONG).show()
            userModel.postValue(true)
        }else{
            Toast.makeText(context, "Login Incorrecto", Toast.LENGTH_LONG).show()
            userModel.postValue(false)
        }

    }

}