package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivitySettingAlarmBinding

class SettingAlarm : AppCompatActivity() {
    private val viewBinding : ActivitySettingAlarmBinding by lazy {
        ActivitySettingAlarmBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

    }
}