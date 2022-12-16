package com.example.thrity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivitySettingBinding

class Setting : AppCompatActivity() {
    private val viewBinding : ActivitySettingBinding by lazy {
        ActivitySettingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

        viewBinding.tvMy.setOnClickListener{
            val intent = Intent(this, SettingMy::class.java)
            startActivity(intent)
        }

        viewBinding.tvSettingAlarm.setOnClickListener{
            val intent = Intent(this, SettingAlarm::class.java)
            startActivity(intent)
        }

        viewBinding.tvShareRange.setOnClickListener {
            val intent = Intent(this, SettingShareRange::class.java)
            startActivity(intent)
        }
    }
}