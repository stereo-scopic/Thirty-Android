package com.example.thrity.Challenge

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thrity.Challenge.Adaptor.ListChallengeAdaptor
import com.example.thrity.ChallengeGridData
import com.example.thrity.ItemDecorator
import com.example.thrity.Challenge.Adaptor.ListChallengeGridAdaptor
import com.example.thrity.ChallengeListData
import com.example.thrity.databinding.FragmentChallengeBinding

class ChallengeFragment: Fragment() {
    private lateinit var viewBinding: FragmentChallengeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentChallengeBinding.inflate(layoutInflater)

        //List RecyclerView
        val list: ArrayList<ChallengeListData> = arrayListOf()
        list.apply {
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
            add(ChallengeListData("최애 공통점 찾기 챌린지"))
        }

        val listRVAdaptor = ListChallengeAdaptor(list)
        val listManager = LinearLayoutManager.HORIZONTAL
        viewBinding.rvList.adapter = listRVAdaptor
        viewBinding.rvList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        //Grid RecyclerView
        val gridList: ArrayList<ChallengeGridData> = arrayListOf()
        gridList.apply{
            for(i: Int in 1..30){
                add(ChallengeGridData("$i"))
            }
        }

        val gridListManager = GridLayoutManager(context, 6)
        val gridListAdapter = ListChallengeGridAdaptor(gridList){
            //RecyclerView Click 시 실행
            Data -> viewBinding.layoutNon.visibility = View.VISIBLE
            viewBinding.vertical.fullScroll(ScrollView.FOCUS_DOWN)
            viewBinding.tvNum.text = "#"+Data.num
            viewBinding.tvWrite.setOnClickListener {
                val intent = Intent(context,ChallengePost::class.java)
                intent.putExtra("numData",Data.num)
                startActivity(intent)
            }
        }
        viewBinding.rvChallenge.adapter = gridListAdapter
        viewBinding.rvChallenge.layoutManager = gridListManager
        viewBinding.rvChallenge.addItemDecoration(ItemDecorator(0))

        return viewBinding.root
    }
}
