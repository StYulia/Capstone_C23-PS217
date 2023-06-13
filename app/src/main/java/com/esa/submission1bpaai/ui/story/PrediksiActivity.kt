package com.esa.submission1bpaai.ui.story

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.esa.submission1bpaai.R
import com.esa.submission1bpaai.data.network.api.ApiConfigModel
import com.esa.submission1bpaai.data.network.response.BaseResponse
import com.esa.submission1bpaai.data.network.response.PredictResponse
import com.esa.submission1bpaai.data.network.response.RecommendationResponse
import com.esa.submission1bpaai.data.request.PredictRequest
import com.esa.submission1bpaai.data.request.RecommendationRequest
import com.esa.submission1bpaai.databinding.ActivityNutrisiBinding
import com.esa.submission1bpaai.databinding.ActivityPrediksiBinding
import com.esa.submission1bpaai.ui.user.UserViewModel
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PrediksiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrediksiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrediksiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()

        val hasilprediksi = intent.getStringExtra("hasilprediksi")
        binding.hasilprediksi.text = hasilprediksi

    }

    private fun onClick(){
        binding.buttonRekomendasi.setOnClickListener {
        val name: String? = intent.getStringExtra("hasilrekomendasi")
            val recommend = Intent(this@PrediksiActivity, RecommendActivity::class.java)
            recommend.putExtra("name", name)
            startActivity(recommend)
        }
    }

}

