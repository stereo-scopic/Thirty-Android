package com.example.thrity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thrity.databinding.FragmentCommunityAllBinding

class CommunityAllFragment: Fragment() {
    private lateinit var viewBinding: FragmentCommunityAllBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentCommunityAllBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}