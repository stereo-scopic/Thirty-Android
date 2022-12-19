package com.example.thrity.My

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivityBadgeBinding

class Badge : AppCompatActivity() {
    private val viewBinding : ActivityBadgeBinding by lazy {
        ActivityBadgeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }
    }
}