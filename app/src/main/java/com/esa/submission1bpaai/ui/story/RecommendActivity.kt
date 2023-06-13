package com.esa.submission1bpaai.ui.story

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.esa.submission1bpaai.R
import com.esa.submission1bpaai.data.network.api.ApiConfigModel
import com.esa.submission1bpaai.data.network.response.BaseResponse
import com.esa.submission1bpaai.data.network.response.RecommendationResponse
import com.esa.submission1bpaai.data.request.RecommendationRequest
import com.esa.submission1bpaai.databinding.ActivityRecommendBinding
import com.esa.submission1bpaai.ui.adapter.RecommendationAdapter
import com.esa.submission1bpaai.ui.user.UserViewModel
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RecommendActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecommendBinding
    private lateinit var adapter: RecommendationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommendBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val layoutManager = LinearLayoutManager(this)
        binding.listrekomendasi.layoutManager = layoutManager

        val itemDecoration = DividerItemDecoration(this, layoutManager.orientation)
        binding.listrekomendasi.addItemDecoration(itemDecoration)

   recommend()
    }

    private fun recommend() {
        //_userInfo.postValue(Resource.Loading())
        val name : String? = intent.getStringExtra("name")
        val client = ApiConfigModel.getApiClient().recommend(RecommendationRequest(name))

        client.enqueue(object : Callback<RecommendationResponse> {
            override fun onResponse(call: Call<RecommendationResponse>, response: Response<RecommendationResponse>) {
                if (response.isSuccessful) {
                    val responseBody = response.body()

                    if (responseBody != null){
                        getpredictmodel(responseBody.recommendation as List<String>)
                    }

                } else {
                    val errorResponse = Gson().fromJson(
                        response.errorBody()?.charStream(),
                        BaseResponse::class.java
                    )
                    // _userInfo.postValue(Resource.Error(errorResponse.message))
                }
            }

            override fun onFailure(call: Call<RecommendationResponse>, t: Throwable) {
                Log.e(
                    UserViewModel::class.java.simpleName,
                    "onFailure"
                )
                //  _userInfo.postValue(Resource.Error(t.message))
            }
        })
    }

    private fun getpredictmodel(recommend: List<String>){

        adapter = RecommendationAdapter(recommend)
        binding.listrekomendasi.adapter = adapter

    }
}

