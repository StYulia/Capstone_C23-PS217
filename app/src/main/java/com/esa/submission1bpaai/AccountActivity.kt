package com.esa.submission1bpaai

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.ViewModelProvider
import com.esa.submission1bpaai.data.preference.UserPreferences
import com.esa.submission1bpaai.databinding.ActivityAccountBinding
import com.esa.submission1bpaai.ui.story.MainActivity
import com.esa.submission1bpaai.ui.user.LoginActivity
import com.esa.submission1bpaai.ui.user.UserViewModel
import com.esa.submission1bpaai.util.ViewModelFactory

class AccountActivity : AppCompatActivity() {
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "token")
    private lateinit var binding: ActivityAccountBinding
    private lateinit var userViewModel: UserViewModel


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupViewModel()
        onClick()
    }

    private fun onClick() {
        binding.fablogout.setOnClickListener {
            userViewModel.logout()
            startActivity(Intent(this, LoginActivity::class.java))
            finishAffinity()
        }
        binding.btnBantuan.setOnClickListener{
            startActivity(Intent(this, Bantuan::class.java))
        }
        binding.btnTentang.setOnClickListener{
            startActivity(Intent(this, Tentang::class.java))
        }
        binding.fabhome.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.fabartikel.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.fabnutrisi.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    private fun setupViewModel() {
        val pref = UserPreferences.getInstance(dataStore)
        val viewModelFactory = ViewModelFactory(pref)

        userViewModel= ViewModelProvider(this, viewModelFactory)[UserViewModel::class.java]

    }

}