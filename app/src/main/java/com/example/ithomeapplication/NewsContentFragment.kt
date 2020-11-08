package com.example.ithomeapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_news_content.*

class NewsContentFragment : Fragment() {

    private lateinit var news: News
    companion object{
        const val KEY: String = "KEY"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_news_content, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null) {
            savedInstanceState.getParcelable<News>(KEY)?.let { refresh(it) }
        }
    }

    fun refresh(data: News) {
        news = data
        //显示布局内容
        ContentLayout.visibility = View.VISIBLE
        ContentTitle.text = news.title
        ContentTime.text = news.time
        ContentEditor.text = news.editor
        ContentText.text = news.content
        ContentImg.setImageResource(news.img)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //这里存在NULL的情况，当Fragment没有新闻内容时旋转，要判断news是否已初始化
        if (::news.isInitialized) {
            outState.putParcelable(KEY, news)
        }
    }
}