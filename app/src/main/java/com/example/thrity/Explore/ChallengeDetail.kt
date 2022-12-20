package com.example.thrity.Explore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thrity.Explore.Adaptor.ListChallengeAddGridAdaptor
import com.example.thrity.ChallengeAddGridData
import com.example.thrity.ItemDecorator
import com.example.thrity.databinding.ActivityChallengeDetailBinding

class ChallengeDetail : AppCompatActivity() {
    private val viewBinding: ActivityChallengeDetailBinding by lazy {
        ActivityChallengeDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        val gridList: ArrayList<ChallengeAddGridData> = arrayListOf()
        gridList.apply{
            for(i: Int in 1..30){
                add(ChallengeAddGridData("$i", "닮은 버릇이 있다면?"))
            }
        }

        val gridListManager = GridLayoutManager(this, 6)
        val gridListAdapter = ListChallengeAddGridAdaptor(gridList)
        viewBinding.rvChallengeAdd.adapter = gridListAdapter
        viewBinding.rvChallengeAdd.layoutManager = gridListManager
        viewBinding.rvChallengeAdd.addItemDecoration(ItemDecorator(0))

        viewBinding.btnChallengeAdd.setOnClickListener {
            viewBinding.btnChallengeAdd.visibility = View.GONE
            viewBinding.btnChallengeClicked.visibility = View.VISIBLE
        }
    }

}