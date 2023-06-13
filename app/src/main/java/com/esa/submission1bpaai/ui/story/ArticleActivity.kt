package com.esa.submission1bpaai.ui.story

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.esa.submission1bpaai.AccountActivity
import com.esa.submission1bpaai.R
import com.esa.submission1bpaai.R.id.rvFoods
import com.esa.submission1bpaai.data.model.Article
import com.esa.submission1bpaai.databinding.ActivityMainBinding
import com.esa.submission1bpaai.ui.user.LoginActivity

class ArticleActivity : AppCompatActivity() {
    private lateinit var rvArticle: RecyclerView
    private var list: ArrayList<Article> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_article)

        rvArticle = findViewById(rvFoods)
        rvArticle.setHasFixedSize(true)

        list.addAll(ArticleData.listData)
        showRecycler()

    }


    private fun showRecycler() {
        rvArticle.layoutManager = LinearLayoutManager(this)
        val articleAdapter = ArticleAdapter(list)
        rvArticle.adapter = articleAdapter

        articleAdapter.setOnItemClickCallback(object : ArticleAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Article) {
                val intentToDetail = Intent(this@ArticleActivity, FrameIcs::class.java)
                //intentToDetail.putExtra("DATA", data)
                intentToDetail.putExtra("DATA", data)
                startActivity(intentToDetail)
            }
        })
    }
}