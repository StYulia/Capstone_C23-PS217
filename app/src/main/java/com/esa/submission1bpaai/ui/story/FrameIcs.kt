package com.esa.submission1bpaai.ui.story

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.esa.submission1bpaai.R
import com.esa.submission1bpaai.data.model.Article

class FrameIcs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_ics)
        val data = intent.getParcelableExtra<Article>("DATA")

        val android_name: TextView = findViewById(R.id.android_ver)
        val android_detail: TextView = findViewById(R.id.android_detail)
        val android_logo: ImageView = findViewById(R.id.and_logo)

        android_name.text = data?.name.toString()
        android_detail.text = data?.detail.toString()
        data?.photo?.let { android_logo.setImageResource(it.toInt()) }
    }
}