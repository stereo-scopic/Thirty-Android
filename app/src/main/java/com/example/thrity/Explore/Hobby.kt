package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thrity.databinding.ActivityHobbyBinding
import com.example.thrity.databinding.ActivityMainBinding

class Hobby : AppCompatActivity() {
    private val viewBinding: ActivityHobbyBinding by lazy {
        ActivityHobbyBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

        //Recycler View
        val list: ArrayList<Data> = arrayListOf()

        list.apply {
            add(Data("최애 아이돌 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 사진 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 배우 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 작품 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 레전드 모먼트 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 드로잉 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 공통점 찾기 챌린지", "챌린지 설명 블라블라"))
            add(Data("최애 손민수 챌린지", "챌린지 설명 블라블라"))
        }

        val listManager = GridLayoutManager(this, 2)
        val listAdapter = ListAdapterGrid(list)
        viewBinding.rvHobby.adapter = listAdapter
        viewBinding.rvHobby.layoutManager = listManager

        //제목 변경
        val titleData = intent.getStringExtra("TitleData")
        viewBinding.titleSetting. text = titleData

    }
}