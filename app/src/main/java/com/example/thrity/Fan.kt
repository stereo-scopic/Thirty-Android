package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivityFanBinding

class Fan : AppCompatActivity() {
    private val viewBinding: ActivityFanBinding by lazy {
        ActivityFanBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

    }
}