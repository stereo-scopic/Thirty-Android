package com.example.thrity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.thrity.databinding.FragmentExploreBinding

class ExploreFragment: Fragment() {
    private lateinit var viewBinding:FragmentExploreBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentExploreBinding.inflate(layoutInflater)

        viewBinding.exploreHobby.setOnClickListener{
            val intent = Intent(context, Hobby::class.java)
            startActivity(intent)
        }
        return viewBinding.root
    }
}