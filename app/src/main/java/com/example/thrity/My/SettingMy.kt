package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivitySettingMyBinding

class SettingMy : AppCompatActivity() {
    private val viewBinding : ActivitySettingMyBinding by lazy {
        ActivitySettingMyBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }
    }
}