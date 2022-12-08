package com.example.thrity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thrity.databinding.FragmentCommunityFriendBinding

class CommunityFriendFragment: Fragment() {
    private lateinit var viewBinding: FragmentCommunityFriendBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentCommunityFriendBinding.inflate(layoutInflater)
        val list : ArrayList<ComData> = arrayListOf()
//        list.apply{
//        }

        val listRVAdaptor = ListNoticeAdaptor(list)
        viewBinding.rvFriend.adapter = listRVAdaptor
        viewBinding.rvFriend.layoutManager = LinearLayoutManager(this)

        return viewBinding.root
    }
}