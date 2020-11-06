package com.example.ithomeapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //标记单双页，false为单页，true为双页
    private var isTwoPane = false
    private val newsList = ArrayList<News>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //判断单双页
        isTwoPane = NewsContentTwoPane != null
        initNewsList()
        NewsRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter=NewsAdapter(newsList)
        NewsRecyclerView.adapter=adapter
    }

    private fun initNewsList() {
        repeat(5)
        {
            newsList.add(
                News(
                    "理想汽车创始人李想：我早就财务自由了，估价和我没太大关系",
                    "2020-11-06 16:11:12",
                    "86",
                    R.drawable.img_1,
                    "IT之家(懒猫)",
                    "11 月 1 日，理想汽车创始人李想在 OTA 2.0 发布会上接受媒体采访。面对记者问及对当下股价是高是低和对特斯拉的观点时，李想回答：“我早就财务自由了，股价和我没太大关系… 股价是由企业基本面和市场决定的，市场我们完全影响不了，有时候我们觉得好，股价却反而往下走；基本面是销量和收入决定，我们只能把这两个核心做好…”"
                )
            )
            newsList.add(
                News(
                    "小米拍拍无线投屏器开启预售：内置 Wi-Fi 5G 频段，支持 60Hz 画面传输",
                    "2020-11-06 16:02:10",
                    "78",
                    R.drawable.img_2,
                    "IT之家(懒猫)",
                    "小米拍拍无线投屏器内置 Wi-Fi 5G 频段，无需联网可高速传输，同时兼容多种 HDMI 接口的显示设备，包括电视、投影、显示器等多种设备。\n" +
                            "\n" +
                            "IT之家了解到，小米拍拍无线投屏器采用白色外观，产品净重约 77g，自带 HDMI 接口，还支持全高清分辨率以及 60Hz 画面传输。"
                )
            )
            newsList.add(
                News(
                    "安卓 11 降临，realme X50 Pro 5G 推送 realme UI2.0 公测版",
                    "2020-11-06 12:28:48",
                    "65",
                    R.drawable.img_3,
                    "IT之家(问舟)",
                    "IT之家11月6日消息 据网友投递，realme X50 Pro 5G 现已推送基于安卓 11 的 realme UI2.0 公测版\n" +
                            "\n" +
                            "此次更新包体积为 4.07GB，修复部分已知问题，提升系统定性，具体修复内容如图所示。\n" +
                            "\n" +
                            "据 realme 社区网友反馈，该版本可能存在部分问题，例如充电明显变慢、高性能模式玄学问题、王者荣耀频繁掉帧卡顿有明显延迟、无端占用 5G 运存、跑分大幅度降低等，但新增特性个性化设置、小窗、动画优化等也可以显著提高体验。"
                )
            )
            newsList.add(
                News(
                    "iPhone 锁定屏幕键盘输入密码时可能漏输，苹果在 iOS 14.2 修复了",
                    "2020-11-06 9:26:17",
                    "256",
                    R.drawable.img_4,
                    "IT之家(懒猫)",
                    "IT之家11月6日消息 今日，苹果发布了 iPhone 12 系列发售后的第一个 iOS 正式版更新——iOS 14.2。\n" +
                            "\n" +
                            "iOS 14.2 带来了 100 多个全新表情符号、同时，AirPods 的优化电池充电可通过减少 AirPods 完全充电的时间，来减缓电池老化速率。\n" +
                            "\n" +
                            "值得一提的是，在 iOS 14.2 中，苹果还修复了锁定屏幕中的键盘在用户尝试输入密码时可能漏输的问题。"
                )
            )
            newsList.add(
                News(
                    "原神 10 月收入全球游戏第一，在 78 个国家位列前十",
                    "2020-11-06 15:30:09",
                    "62",
                    R.drawable.img_5,
                    "IT之家(懒猫)",
                    "App Annie 指出，上月因直播爆红回流的 InnerSloth 的《Among Us!》本月仍稳坐全球下载冠军宝座，热度持续。开发团队宣布放弃第二代的发行，将专注于第一代的改良。\n" +
                            "\n" +
                            "此外，上月底上线的《原神》在一个月内飙升到全球游戏榜收入第一，10 月 20 日推出的武器池更新让《原神》在全球 78 个国家游戏收入总榜都取得前 10 名的成绩。\n" +
                            "\n" +
                            "IT之家了解到，10 月全球热门游戏下载排行方面，《Among Us!》《原神》《地铁跑酷》《Free fire》《团结行动！》位列前五；收入排行方面，《原神》《Pokémom GO》《ROBLOX》《王者荣耀》《怪物弹珠》分列前五位。"
                )
            )
            newsList.add(
                News(
                    "小红书回应 “用户笔记存在大尺度内容”：已封禁，对涉黄、色情信息 “零容忍”",
                    "2020-11-06 14:58:45",
                    "IT之家(孤城)",
                    R.drawable.img_8,
                    "",
                    "IT之家11月6日消息 今天上午，小红书在官方微博发布声明，就近日有媒体报道的“用户涉黄”问题做出回应。" +
                            "\n" +
                            "IT之家了解到，小红书表示平台已于第一时间对举报中涉及的用户和内容进行详细核查，查出其中有一例有低俗内容导流行为的账号，此前已于10月30日被平台封禁。其他相关用户的笔记内容、互动评论等信息均不存在违法、违规行为，也未发现涉黄。针对举报中提及用户在微信、QQ等第三方平台涉黄行为，小红书平台已提交相关管理部门做进一步调查。" +
                            "\n" +
                            "小红书最后表示，对恶意传播涉黄、色情等内容的行为一贯“零容忍”，涉嫌违法线索信息一经发现就将报送公安机关处理。"
                )
            )
            newsList.add(
                News(
                    "苹果 Safari 浏览器翻译功能现已上线更多国家",
                    "2020-11-6 10:10:06",
                    "49",
                    R.drawable.img_9,
                    "IT之家(懒猫)",
                    "IT之家11月6日消息 今年，苹果为 iOS 14 带来了全新的翻译 App，还为自带的 Safari 浏览器加入了翻译功能，支持中文、英语等 11 种语言。" +
                            "\n" +
                            "然而，苹果并未在所有国家和地区上线 Safari 翻译功能。据外媒 9to5Mac 报道，目前苹果正在将这一功能推广到更多国家和地区，巴西、德国现已支持 Safari 翻译功能。" +
                            "\n" +
                            "IT之家了解到，借助该功能，用户可以快速翻译网页中的文本。翻译应用和 Safari 翻译均支持以下语言：阿拉伯语、中文、英语、法语、德语、意大利语、日语、韩语、葡萄牙语、俄语和西班牙语。"
                )
            )
            newsList.add(
                News(
                    "iPhone 12 京东控股店降价：64G 版低至 5999 元",
                    "2020-11-06 15:35:15",
                    "162",
                    R.drawable.img_10,
                    "IT之家(百竹)",
                    "iPhone 12 采用6.1英寸超视网膜 XDR OLED屏幕，观感更加细腻，且边框变窄，机身重162克（iPhone 11 为194克）。\n" +
                            "\n" +
                            "iPhone 12 在5G网络下，理想条件下速度约为3.5Gbps，日常情况下为1Gbps。支持 Smart Data Mode 智能数据网络模式，结合网络情况自动切换4G/5G网络，节省电量，提升续航。\n" +
                            "\n" +
                            "iPhone 12 采用 A14 仿生芯片，采用台积电5nm制程工艺。\n" +
                            "\n" +
                            "采用超广角双摄方案，焦距分为为13mm与26mm，主摄采用1200万像素f/1.6镜头，支持光学防抖，夜拍能力也有一定提升。\n" +
                            "\n" +
                            "另外，iPhone 12 mini 和 iPhone 12 Pro Max 将于今日晚 21 点开启预售，11 月 13 日发售。"
                )
            )
        }
    }

    inner class NewsAdapter(private val newsList: ArrayList<News>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val title: TextView = view.findViewById(R.id.Title)
            val time: TextView = view.findViewById(R.id.Time)
            val comment: TextView = view.findViewById(R.id.Comment)
            val img: ImageView = view.findViewById(R.id.Img)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
            val viewHolder = ViewHolder(view)
            viewHolder.itemView.setOnClickListener {
                //获取点击的项
                Log.i("newsList",viewHolder.adapterPosition.toString())
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