package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thrity.databinding.ActivityNoticeBinding

class Notice : AppCompatActivity() {
    private val viewBinding : ActivityNoticeBinding by lazy {
        ActivityNoticeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

        //Recycler View
        val list : ArrayList<noticeData> = arrayListOf()

        list.apply{
            add(noticeData("나는야 써티 작업중", "2022-12-08"))
            add(noticeData("이거를 언제 다하나 ", "2022-12-08"))
            add(noticeData("플러터가 편한지", "2022-12-08"))
            add(noticeData("안드로이드가 편한지", "2022-12-08"))
            add(noticeData("challenge 화면 만들어야하는데", "2022-12-08"))
            add(noticeData("만들 화면이 너무 마나", "2022-12-08"))
            add(noticeData("귀여우니까 그나마 봐줌", "2022-12-08"))
            add(noticeData("스크롤이 되는지 보려면", "2022-12-08"))
            add(noticeData("엄청 많이 해봐야 하거등여", "2022-12-08"))
            add(noticeData("그래서 다 쓰고 있지여", "2022-12-08"))
            add(noticeData("아무것도 안쓰면 재미 없으니까", "2022-12-08"))
            add(noticeData("뭐라도 쓰는 중", "2022-12-08"))
            add(noticeData("공지사항 입니다아", "2022-12-08"))
            add(noticeData("블라 블라 블라 블라 블라 블라 블라 블라 블라블라 블라 블라 블라 블라 블라 블라 블라 블라 블라 블라 블라", "2022-12-08"))
            add(noticeData("배포까지 할테야", "2022-12-08"))

        }

        val listRVAdaptor = ListNoticeAdaptor(list)
        viewBinding.rvNoticeData.adapter = listRVAdaptor
        viewBinding.rvNoticeData.layoutManager = LinearLayoutManager(this)
    }

}