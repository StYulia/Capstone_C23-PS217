package com.esa.submission1bpaai.data.request

import com.google.gson.annotations.SerializedName

class PredictRequest (
    @SerializedName("usia")
    val usia: Int,
    @SerializedName ("tinggi_badan")
    val tinggi_badan: Float,
    @SerializedName("berat_badan")
    val berat_badan: Int,
)