package com.esa.submission1bpaai.ui.story

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.esa.submission1bpaai.data.Resource
import com.esa.submission1bpaai.data.model.Story
import com.esa.submission1bpaai.data.preference.UserPreferences

class MainViewModel(private val pref: UserPreferences) : ViewModel(){
    private val _stories = MutableLiveData<Resource<ArrayList<Story>>>()
    val stories: LiveData<Resource<ArrayList<Story>>> = _stories

//    suspend fun getStories() {
//        _stories.postValue(Resource.Loading())
//        val client =
//            ApiConfig.getApiClient().getStories(token = "Bearer ${pref.getToken().first()}")
//
//        client.enqueue(object : Callback<StoryResponse> {
//            override fun onResponse(call: Call<StoryResponse>, response: Response<StoryResponse>) {
//
//                if (response.isSuccessful) {
//                    response.body()?.let {
//                        val listStory = it.listStory
//                        _stories.postValue(Resource.Success(ArrayList(listStory)))
//                    }
//                } else {
//                    val errorResponse = Gson().fromJson(
//                        response.errorBody()?.charStream(),
//                        BaseResponse::class.java
//                    )
//                    _stories.postValue(Resource.Error(errorResponse.message))
//                }
//            }
//
//            override fun onFailure(call: Call<StoryResponse>, t: Throwable) {
//                Log.e(
//                    MainViewModel::class.java.simpleName,
//                    "onFailure getStories"
//                )
//                _stories.postValue(Resource.Error(t.message))
//            }
//        })
//    }
}