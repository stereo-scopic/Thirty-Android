package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivityHobbyBinding
import com.example.thrity.databinding.ActivityLoveBinding

class Love : AppCompatActivity() {
    private val viewBinding: ActivityLoveBinding by lazy {
        ActivityLoveBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

    }
}