package com.example.thrity.Challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.bumptech.glide.Glide
import com.example.thrity.R
import com.example.thrity.databinding.ActivityChallengePostBinding

class ChallengePost : AppCompatActivity() {
    private val viewBinding : ActivityChallengePostBinding by lazy {
        ActivityChallengePostBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        checkPermission.launch(permissionList)

        viewBinding.btnCamera.setOnClickListener {
            readImage.launch("image/*")
        }

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

        viewBinding.btnImgDelete.setOnClickListener {
            viewBinding.layoutImage.visibility = View.GONE
        }

        viewBinding.btnStamp.setOnClickListener {
            viewBinding.layoutStamp.visibility = View.VISIBLE
            viewBinding.btnStampGreen.setOnClickListener {
                viewBinding.imgStamp.visibility = View.VISIBLE
                viewBinding.imgStamp.setImageResource(R.drawable.stamp_green)
                viewBinding.layoutStamp.visibility = View.GONE
            }
            viewBinding.btnStampYellow.setOnClickListener {
                viewBinding.imgStamp.visibility = View.VISIBLE
                viewBinding.imgStamp.setImageResource(R.drawable.stamp_yellow)
                viewBinding.layoutStamp.visibility = View.GONE
            }
            viewBinding.btnStampRed.setOnClickListener {
                viewBinding.imgStamp.visibility = View.VISIBLE
                viewBinding.imgStamp.setImageResource(R.drawable.stamp_red)
                viewBinding.layoutStamp.visibility = View.GONE
            }
        }


        val titleNum = intent.getStringExtra("numData")
        viewBinding.tvNum.text = "#"+titleNum
    }

    //사진
    //갤러리 접근 권한
    private val permissionList = arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE)
    private val checkPermission = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { result ->
        result.forEach {
            if(!it.value) {
                Toast.makeText(applicationContext, "권한 동의 필요", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }
    //사진 가져오기
    private val readImage = registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        Glide.with(this)
            .load(uri)
            .override(400, 400)
            .centerCrop()
            .into(viewBinding.imgSet)
        viewBinding.layoutImage.visibility = View.VISIBLE
    }
}