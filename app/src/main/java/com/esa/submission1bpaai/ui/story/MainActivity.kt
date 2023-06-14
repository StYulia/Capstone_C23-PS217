package com.esa.submission1bpaai.ui.story

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import androidx.lifecycle.ViewModelProvider
import com.esa.submission1bpaai.AccountActivity
import com.esa.submission1bpaai.NutrisiActivity
import com.esa.submission1bpaai.data.Resource
import com.esa.submission1bpaai.data.preference.UserPreferences
import com.esa.submission1bpaai.databinding.ActivityMainBinding
import com.esa.submission1bpaai.ui.adapter.StoryAdapter
import com.esa.submission1bpaai.ui.user.LoginActivity
import com.esa.submission1bpaai.ui.user.RegisterActivity
import com.esa.submission1bpaai.ui.user.UserViewModel
import com.esa.submission1bpaai.util.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "token")
    private lateinit var binding: ActivityMainBinding
    private lateinit var storyAdapter: StoryAdapter
    private lateinit var mainViewModel: MainViewModel
    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        setupViewModel()
        setupView()
        onClick()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
    }

    private fun onClick() {
//
        binding.btnNutrisi.setOnClickListener{
            startActivity(Intent(this, NutrisiActivity::class.java))
        }
        binding.btnArtikel.setOnClickListener{
            startActivity(Intent(this, ArticleActivity::class.java))
        }
        binding.btnProfil.setOnClickListener{
            startActivity(Intent(this, AccountActivity::class.java))
        }
        binding.fabhome.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.fabartikel.setOnClickListener{
            startActivity(Intent(this, ArticleActivity::class.java))
        }
        binding.fabnutrisi.setOnClickListener{
            startActivity(Intent(this, NutrisiActivity::class.java))
        }
        binding.fabprofil.setOnClickListener{
            startActivity(Intent(this, AccountActivity::class.java))
        }


    }

    private fun setupView() {
        storyAdapter = StoryAdapter()

        userViewModel.getUserToken().observe(this){ token ->
            if (token.isNotEmpty()){
                mainViewModel.stories.observe(this) {
                    when (it) {
                        is Resource.Success -> {
                            it.data?.let { stories -> storyAdapter.setData(stories) }
                            showLoad(false)
                        }
                        is Resource.Loading -> showLoad(true)
                        is Resource.Error -> {
                            Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                        }
                    }
             }
//                CoroutineScope(Dispatchers.IO).launch {
//                    mainViewModel.getStories()
//                }
            }
            else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }

    }

    private fun setupViewModel() {
        val pref = UserPreferences.getInstance(dataStore)
        val viewModelFactory = ViewModelFactory(pref)

        mainViewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
        userViewModel= ViewModelProvider(this, viewModelFactory)[UserViewModel::class.java]

    }

    private fun showLoad(isLoad: Boolean) {
        if (isLoad){
            binding.progressBar.visibility = View.VISIBLE
        }
        else {
            binding.progressBar.visibility = View.GONE
        }
    }
}

