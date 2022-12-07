package com.example.thrity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thrity.databinding.ActivityHobbyBinding
import com.example.thrity.databinding.ActivityMainBinding

class Hobby : AppCompatActivity() {
    private val viewBinding: ActivityHobbyBinding by lazy {
        ActivityHobbyBinding.inflate(layoutInflater)
    }
    private lateinit var gridManager: GridLayoutManager
    private lateinit var listAdapter: ListAdapterGrid

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.btnBack.setOnClickListener {
            finish()
        }

        var list: ArrayList<String> = arrayListOf()
        var listManager = GridLayoutManager(this, 2)
        listAdapter = ListAdapterGrid(list)
        viewBinding.rvHobby.apply {
            layoutManager = listManager
            adapter = listAdapter
        }


    }
}