package com.esa.submission1bpaai.data.network.response

import com.google.gson.annotations.SerializedName

data class PredictResponse(

	@field:SerializedName("prediction")
	val prediction: Int? = null
)
