package com.esa.submission1bpaai.data.network.response

import com.google.gson.annotations.SerializedName

data class RecommendationResponse(

	@field:SerializedName("recommendation")
	val recommendation: List<String?>?= null
)
