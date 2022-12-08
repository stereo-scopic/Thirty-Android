package com.example.thrity

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CommunityVPAdaptor (fragment: Fragment) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> CommunityFriendFragment()
            1 -> CommunityAllFragment()
            else -> CommunityFriendFragment()
        }
    }
}