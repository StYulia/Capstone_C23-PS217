package com.esa.submission1bpaai.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Article (
    val name: String,
    val detail: String,
    val photo: Int
) : Parcelable
