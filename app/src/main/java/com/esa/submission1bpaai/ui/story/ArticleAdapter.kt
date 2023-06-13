package com.esa.submission1bpaai.ui.story

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.esa.submission1bpaai.R
import com.esa.submission1bpaai.data.model.Article

class ArticleAdapter(val listFood: List<Article>) : RecyclerView.Adapter<ArticleAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_food)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ListViewHolder(view)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Article)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition])
        }
//            when (position) {
//                0 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "tigabelaspro")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                1 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "duabelassultra")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                2 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "mixfolddua")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                3 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "duabelaspro")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                4 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "duabelasspro")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                5 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "tigabelas")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                6 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "kenampuluhpro")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                7 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "klimapuluh")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                8 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "duabelas")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//                9 -> {
//                    val context=holder.imgPhoto.context
//                    val intent = Intent( context, frame_ics::class.java)
//                    intent.putExtra("and_ver", "poco")
//                    intent.putExtra("and_name", holder.tvName.text.toString())
//                    intent.putExtra("and_detail", holder.tvDetail.text.toString())
//                    context.startActivity(intent)
//                }
//            }

  }

    override fun getItemCount(): Int {
        return listFood.size
    }

}