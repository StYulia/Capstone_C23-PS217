package com.esa.submission1bpaai.ui.user

import android.util.Log
import androidx.lifecycle.*
import com.esa.submission1bpaai.data.Resource
import com.esa.submission1bpaai.data.network.api.ApiConfig
import com.esa.submission1bpaai.data.network.response.BaseResponse
import com.esa.submission1bpaai.data.network.response.LoginResponse
import com.esa.submission1bpaai.data.preference.UserPreferences
import com.esa.submission1bpaai.data.request.LoginRequest
import com.esa.submission1bpaai.data.request.RegisterRequest
import com.google.gson.Gson
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel(private val pref: UserPreferences) : ViewModel() {
    private val _userInfo = MutableLiveData<Resource<String>>()
    val userInfo: LiveData<Resource<String>> = _userInfo

    fun login(email: String, password: String) {
        _userInfo.postValue(Resource.Loading())
        val client = ApiConfig.getApiClient().login(LoginRequest(email, password))

        client.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful) {

                    val result = response.body()?.accessToken

                    result?.let { saveUserToken(it) }
                    _userInfo.postValue(Resource.Success(result))
                } else {
                    val errorResponse = Gson().fromJson(
                        response.errorBody()?.charStream(),
                        BaseResponse::class.java
                    )
                    _userInfo.postValue(Resource.Error(errorResponse.message))
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                Log.e(
                    UserViewModel::class.java.simpleName,
                    "onFailure login"
                )
                _userInfo.postValue(Resource.Error(t.message))
            }
        })
    }


    fun register( email: String, password: String) {
        _userInfo.postValue(Resource.Loading())
        val client = ApiConfig.getApiClient().register(RegisterRequest( email, password))

        client.enqueue(object : Callback<BaseResponse> {
            override fun onResponse(call: Call<BaseResponse>, response: Response<BaseResponse>) {
                if (response.isSuccessful) {
                    val message = response.body()?.message.toString()
                    _userInfo.postValue(Resource.Success(message))
                } else {
                    val errorResponse = Gson().fromJson(
                        response.errorBody()?.charStream(),
                        BaseResponse::class.java
                    )
                    _userInfo.postValue(Resource.Error(errorResponse.message))
                }
            }

            override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                Log.e(
                    UserViewModel::class.java.simpleName,
                    "onFailure register"
                )
                _userInfo.postValue(Resource.Error(t.message))
            }
        })
    }

    fun logout() = deleteUserToken()

    fun getUserToken() = pref.getToken().asLiveData()

    private fun saveUserToken(key: String) {
        viewModelScope.launch {
            pref.saveToken(key)
        }
    }

    private fun deleteUserToken() {
        viewModelScope.launch {
            pref.deleteToken()
        }
    }
}