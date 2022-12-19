package com.example.thrity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thrity.databinding.FragmentChallengeBinding

class ChallengeFragment: Fragment() {
    private lateinit var viewBinding: FragmentChallengeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentChallengeBinding.inflate(layoutInflater)

        viewBinding.btnPost.setOnClickListener {
            val intent = Intent(context, ChallengePost::class.java)
            startActivity(intent)
        }

        //grid 번갈아 그리기
        val list: ArrayList<ChallengeGridData> = arrayListOf()
        list.apply{
            for(i: Int in 1..30){
                add(ChallengeGridData("$i"))
            }
        }

        val listManager = GridLayoutManager(context, 6)
        val listAdapter = ListChallengeGridAdaptor(list)
        viewBinding.rvChallenge.adapter = listAdapter
        viewBinding.rvChallenge.layoutManager = listManager
        viewBinding.rvChallenge.addItemDecoration(ItemDecorator(0))

        return viewBinding.root
    }
}