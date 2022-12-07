package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thrity.databinding.ActivityStudyBinding

class Study : AppCompatActivity() {
    private val viewBinding : ActivityStudyBinding by lazy {
        ActivityStudyBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

    }
}