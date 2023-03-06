package com.example.thrity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thrity.databinding.ActivityOnboardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private val viewBinding: ActivityOnboardingBinding by lazy {
        ActivityOnboardingBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnHobby.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.drawable.onbording_hobby_click)
            viewBinding.btnLove.setImageResource(R.color.Gray_700)
            viewBinding.btnFan.setImageResource(R.color.Gray_700)
            viewBinding.btnSelfcare.setImageResource(R.color.Gray_700)
            viewBinding.btnDiet.setImageResource(R.color.Gray_700)
            viewBinding.btnStudy.setImageResource(R.color.Gray_700)
            viewBinding.btnFitness.setImageResource(R.color.Gray_700)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }

        viewBinding.btnLove.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.color.Gray_700)
            viewBinding.btnLove.setImageResource(R.drawable.onbording_love_click)
            viewBinding.btnFan.setImageResource(R.color.Gray_700)
            viewBinding.btnSelfcare.setImageResource(R.color.Gray_700)
            viewBinding.btnDiet.setImageResource(R.color.Gray_700)
            viewBinding.btnStudy.setImageResource(R.color.Gray_700)
            viewBinding.btnFitness.setImageResource(R.color.Gray_700)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }

        viewBinding.btnFan.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.color.Gray_700)
            viewBinding.btnLove.setImageResource(R.color.Gray_700)
            viewBinding.btnFan.setImageResource(R.drawable.onbording_fan_click)
            viewBinding.btnSelfcare.setImageResource(R.color.Gray_700)
            viewBinding.btnDiet.setImageResource(R.color.Gray_700)
            viewBinding.btnStudy.setImageResource(R.color.Gray_700)
            viewBinding.btnFitness.setImageResource(R.color.Gray_700)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }

        viewBinding.btnSelfcare.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.color.Gray_700)
            viewBinding.btnLove.setImageResource(R.color.Gray_700)
            viewBinding.btnFan.setImageResource(R.color.Gray_700)
            viewBinding.btnSelfcare.setImageResource(R.drawable.onbording_selfcare_click)
            viewBinding.btnDiet.setImageResource(R.color.Gray_700)
            viewBinding.btnStudy.setImageResource(R.color.Gray_700)
            viewBinding.btnFitness.setImageResource(R.color.Gray_700)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }

        viewBinding.btnDiet.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.color.Gray_700)
            viewBinding.btnLove.setImageResource(R.color.Gray_700)
            viewBinding.btnFan.setImageResource(R.color.Gray_700)
            viewBinding.btnSelfcare.setImageResource(R.color.Gray_700)
            viewBinding.btnDiet.setImageResource(R.drawable.onbording_diet_click)
            viewBinding.btnStudy.setImageResource(R.color.Gray_700)
            viewBinding.btnFitness.setImageResource(R.color.Gray_700)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }

        viewBinding.btnStudy.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.color.Gray_700)
            viewBinding.btnLove.setImageResource(R.color.Gray_700)
            viewBinding.btnFan.setImageResource(R.color.Gray_700)
            viewBinding.btnSelfcare.setImageResource(R.color.Gray_700)
            viewBinding.btnDiet.setImageResource(R.color.Gray_700)
            viewBinding.btnStudy.setImageResource(R.drawable.onbording_study_click)
            viewBinding.btnFitness.setImageResource(R.color.Gray_700)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }

        viewBinding.btnFitness.setOnClickListener{
            viewBinding.btnHobby.setImageResource(R.color.Gray_700)
            viewBinding.btnLove.setImageResource(R.color.Gray_700)
            viewBinding.btnFan.setImageResource(R.color.Gray_700)
            viewBinding.btnSelfcare.setImageResource(R.color.Gray_700)
            viewBinding.btnDiet.setImageResource(R.color.Gray_700)
            viewBinding.btnStudy.setImageResource(R.color.Gray_700)
            viewBinding.btnFitness.setImageResource(R.drawable.onbording_fitness_click)
            viewBinding.btnNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_WHITE))
            viewBinding.tvNext.setBackgroundColor(getResources().getColor(R.color.THIRTY_BLACK))
        }
    }
}