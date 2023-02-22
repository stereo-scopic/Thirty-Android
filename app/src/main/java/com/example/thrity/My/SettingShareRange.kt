package com.example.thrity.My

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.thrity.R
import com.example.thrity.databinding.ActivitySettingShareRangeBinding

class SettingShareRange : AppCompatActivity() {
    private val viewBinding : ActivitySettingShareRangeBinding by lazy {
        ActivitySettingShareRangeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)



        viewBinding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            @SuppressLint("UseCompatLoadingForDrawables")
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (progress == 0) {
                    viewBinding.image.setImageResource(R.drawable.my_sharesetting_1_size)
                    viewBinding.seekBar.thumb = getDrawable(R.drawable.seekbar_thumb)
                }else if (progress == 1){
                    viewBinding.image.setImageResource(R.drawable.my_sharesetting_2_size)
                    viewBinding.seekBar.thumb = getDrawable(R.drawable.seekbar_thumb)
                }else if (progress == 2){
                    viewBinding.image.setImageResource(R.drawable.my_sharesetting_3_size)
                    viewBinding.seekBar.thumb = getDrawable(R.drawable.seekbar_thumb2)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })

        viewBinding.btnBack.setOnClickListener{
            finish()
        }
    }
}