package com.example.ithomeapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //标记单双页，false为单页，true为双页
    private var isTwoPane = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //判断单双页
        isTwoPane = NewsContentTwoPane != null

    }

    inner class NewsAdapter(private val newsList: List<News>) :
        RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val title: TextView = findViewById(R.id.Title)
            val time: TextView = findViewById(R.id.Time)
            val comment: TextView = findViewById(R.id.Comment)
            val img: ImageView = findViewById(R.id.Img)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
            val viewHolder = ViewHolder(view)
            viewHolder.itemView.setOnClickListener {
                //获取点击的项
                val news = newsList[viewHolder.adapterPosition]
                if (isTwoPane) {
                    val fragment = NewsContentTwoPane as NewsContentFragment
                    fragment.refresh(news)
                } else {
                    NewsContentActivity.actionStart(parent.context, news)
                }
            }
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val news = newsList[position]
            holder.title.text = news.title
            holder.time.text = news.time
            holder.comment.text = news.comment
            holder.img.setImageResource(news.img)
        }

        override fun getItemCount() = newsList.size
    }
}