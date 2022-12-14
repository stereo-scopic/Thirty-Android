package com.example.thrity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.thrity.databinding.FragmentChallengeBinding
import com.example.thrity.databinding.FragmentExploreBinding

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
        return viewBinding.root
    }
}