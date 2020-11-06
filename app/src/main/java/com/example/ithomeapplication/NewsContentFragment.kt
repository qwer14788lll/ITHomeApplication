package com.example.ithomeapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_news_content.*

class NewsContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_content, container, false)
    }

    fun refresh(news: News){
        //显示布局内容
        ContentLayout.visibility=View.VISIBLE
        ContentTitle.text=news.title
        ContentTime.text=news.time
        ContentEditor.text=news.editor
        ContentText.text=news.content
        ContentImg.setImageResource(news.img)
    }
}