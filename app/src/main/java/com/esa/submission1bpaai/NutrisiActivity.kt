package com.esa.submission1bpaai

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import com.esa.submission1bpaai.data.Resource
import com.esa.submission1bpaai.data.network.api.ApiConfig
import com.esa.submission1bpaai.data.network.api.ApiConfigModel
import com.esa.submission1bpaai.data.network.response.BaseResponse
import com.esa.submission1bpaai.data.network.response.LoginResponse
import com.esa.submission1bpaai.data.network.response.PredictResponse
import com.esa.submission1bpaai.data.request.LoginRequest
import com.esa.submission1bpaai.data.request.PredictRequest
import com.esa.submission1bpaai.databinding.ActivityNutrisiBinding
import com.esa.submission1bpaai.ui.story.PrediksiActivity
import com.esa.submission1bpaai.ui.user.UserViewModel
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NutrisiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNutrisiBinding
    private lateinit var spinner: Spinner
    private lateinit var hasilrekomendasi: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNutrisiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        spinner = binding.spinner

        onClick()

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                val firstItem = spinner.selectedItem as String
                if (firstItem != parent.getItemAtPosition(position).toString()) {
                    hasilrekomendasi = parent.getItemAtPosition(position).toString()
                } else {
                    hasilrekomendasi = firstItem
                }


            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
        private fun predict(usia: Int, tinggi_badan: Float, berat_badan: Int, ) {
            //_userInfo.postValue(Resource.Loading())
            val client = ApiConfigModel.getApiClient()
                .predict(PredictRequest(usia, tinggi_badan, berat_badan))

            client.enqueue(object : Callback<PredictResponse> {
                override fun onResponse(
                    call: Call<PredictResponse>,
                    response: Response<PredictResponse>
                ) {
                    if (response.isSuccessful) {
                        val responseBody = response.body()

                        if (responseBody != null) {
                            getpredictmodel(responseBody)
                        }

                    } else {
                        val errorResponse = Gson().fromJson(
                            response.errorBody()?.charStream(),
                            BaseResponse::class.java
                        )
                        // _userInfo.postValue(Resource.Error(errorResponse.message))
                    }
                }

                override fun onFailure(call: Call<PredictResponse>, t: Throwable) {
                    Log.e(
                        UserViewModel::class.java.simpleName,
                        "onFailure"
                    )
                    //  _userInfo.postValue(Resource.Error(t.message))
                }
            })
        }

        private fun getpredictmodel(predict: PredictResponse) {
            var hasilpredict: String = "null"

            if (predict.prediction == 1) {

                hasilpredict = " Janin BERPOTENSI stunting"
                callPredict(hasilpredict, hasilrekomendasi)
            } else {
                hasilpredict = "Janin TIDAK berpotensi stunting"
                callPredict(hasilpredict, hasilrekomendasi)
            }
        }

        private fun callPredict(hasilpredict: String, hasilrecommend: String) {
            val predict = Intent(this@NutrisiActivity, PrediksiActivity::class.java)
            predict.putExtra("hasilprediksi", hasilpredict)
            predict.putExtra("hasilrekomendasi", hasilrecommend)
            startActivity(predict)
        }

        override fun onBackPressed() {
            super.onBackPressed()
            moveTaskToBack(true)
        }

        private fun onClick() {
            binding.btnPrediksi.setOnClickListener {
                val usia: Int = binding.umur.text.toString().toInt()
                val tinggi_badan: Float = binding.tinggibadan.text.toString().toFloat()
                val berat_badan: Int = binding.beratbadan.text.toString().toInt()

                predict(usia, tinggi_badan, berat_badan)
            }

        }


    }