package com.pedro.themovieapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.pedro.themovieapp.databinding.ActivityMainBinding
import com.pedro.themovieapp.viewmodel.LoginViewModel
import com.pedro.themovieapp.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bIngresar.setOnClickListener {
            var user = binding.tvUsuario.text.toString()
            var pass = binding.tvPassword.text.toString()
            loginViewModel.login(user, pass, baseContext)
        }

    }
}