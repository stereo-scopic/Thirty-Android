package com.example.thrity.Explore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thrity.Explore.Adaptor.ListChallengeAddGridAdaptor
import com.example.thrity.ChallengeAddGridData
import com.example.thrity.Explore.Adaptor.ListChallengeTitleAdaptor
import com.example.thrity.ItemDecorator
import com.example.thrity.databinding.ActivityChallengeDetailBinding

class ChallengeDetail : AppCompatActivity() {
    private val viewBinding: ActivityChallengeDetailBinding by lazy {
        ActivityChallengeDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        //위에 챌린지 체스판 모양
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
            Toast.makeText(this,"챌린지가 추가되었습니다.", Toast.LENGTH_LONG).show()
        }

        //밑에 질문 미리보기 화면
        val List: ArrayList<ChallengeAddGridData> = arrayListOf()
        List.apply{
            for(i: Int in 1..7){
                add(ChallengeAddGridData("#$i", "닮은 버릇이 있다면?"))
            }
        }
        val listManager = LinearLayoutManager(this)
        val listAdapter = ListChallengeTitleAdaptor(List)
        viewBinding.rvTitle.adapter = listAdapter
        viewBinding.rvTitle.layoutManager = listManager

    }

}