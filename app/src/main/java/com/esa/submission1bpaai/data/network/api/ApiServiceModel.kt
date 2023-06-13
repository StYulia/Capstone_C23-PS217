package com.esa.submission1bpaai.data.network.api

import com.esa.submission1bpaai.data.network.response.PredictResponse
import com.esa.submission1bpaai.data.network.response.RecommendationResponse
import com.esa.submission1bpaai.data.request.PredictRequest
import com.esa.submission1bpaai.data.request.RecommendationRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import java.net.CacheRequest

interface ApiServiceModel {
    @POST("predict")
    fun predict(
        @Body request: PredictRequest
    ): Call<PredictResponse>

    @POST("recommend")
    fun recommend(
        @Body request: RecommendationRequest
    ): Call<RecommendationResponse>

}