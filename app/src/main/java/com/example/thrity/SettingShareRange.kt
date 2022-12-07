package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivitySettingShareRangeBinding

class SettingShareRange : AppCompatActivity() {
    private val viewBinding : ActivitySettingShareRangeBinding by lazy {
        ActivitySettingShareRangeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener{
            finish()
        }
    }
}