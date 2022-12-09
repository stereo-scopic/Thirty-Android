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
        list.apply{
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#3", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#4", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#5", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#6", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#7", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#8", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#9", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#10", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#11", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
            add(ComData("깨찰빵", "아이돌 덕질 챌린지", "#12", "닮은 버릇이 있다면?","지성이는 코 찡긋거리는 버릇이 있는데, 이렇게 해서 손을 대지 않고 코를 긁는 것 같다.", "12-09"))
        }

        val listRVAdaptor = ListCommunityAdaptor(list)
        viewBinding.rvFriend.adapter = listRVAdaptor
        viewBinding.rvFriend.layoutManager = LinearLayoutManager(context)

        return viewBinding.root
    }
}