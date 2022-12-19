package com.example.thrity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.thrity.databinding.FragmentCommunityBinding
import com.example.thrity.databinding.FragmentExploreBinding
import com.google.android.material.tabs.TabLayoutMediator


class CommunityFragment: Fragment() {
    private lateinit var viewBinding: FragmentCommunityBinding

    val tabTitleArray = arrayOf(
        "친구",
        "전체"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentCommunityBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val communityVPAdaptor = CommunityVPAdaptor(this)
        viewBinding.vpCommunity.adapter = communityVPAdaptor

        TabLayoutMediator(viewBinding.tabLayout, viewBinding.vpCommunity) {
            tab, position -> tab.text = tabTitleArray[position]
        }.attach()
    }
}