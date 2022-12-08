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
            intent.putExtra("TitleData", "취미")
            startActivity(intent)
        }

        viewBinding.exploreFan.setOnClickListener{
            val intent = Intent(context, Hobby::class.java)
            intent.putExtra("TitleData", "덕질")
            startActivity(intent)
        }

        viewBinding.exploreLove.setOnClickListener{
            val intent = Intent(context, Hobby::class.java)
            intent.putExtra("TitleData", "연애")
            startActivity(intent)
        }

        viewBinding.exploreCare.setOnClickListener {
            val intent = Intent(context, Hobby::class.java)
            intent.putExtra("TitleData", "셀프케어")
            startActivity(intent)
        }

        viewBinding.exploreDiet.setOnClickListener {
            val intent = Intent(context, Hobby::class.java)
            intent.putExtra("TitleData", "다이어트")
            startActivity(intent)
        }

        viewBinding.exploreFitness.setOnClickListener {
            val intent = Intent(context, Hobby::class.java)
            intent.putExtra("TitleData", "피트니스")
            startActivity(intent)
        }

        viewBinding.exploreStudy.setOnClickListener {
            val intent = Intent(context, Hobby::class.java)
            intent.putExtra("TitleData", "공부")
            startActivity(intent)
        }
        return viewBinding.root
    }
}