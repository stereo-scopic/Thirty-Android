package com.example.thrity.Challenge.Adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.ChallengeGridData
import com.example.thrity.databinding.ChallengeGridItemBinding

class ListChallengeGridAdaptor (var challengeGridList: ArrayList<ChallengeGridData>): RecyclerView.Adapter<ListChallengeGridAdaptor.ChallengeGridDataViewHolder>(){

    inner class ChallengeGridDataViewHolder(private val viewBinding: ChallengeGridItemBinding) : RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: ChallengeGridData) = with(viewBinding){
            tvGridNum.text = data.num

            //6의 배수 처리
            if(tvGridNum.text.toString().toInt() % 6 == 0){
                if (tvGridNum.text.toString().toInt() / 6 != 2 && tvGridNum.text.toString().toInt() / 6 != 4){
                    grid.setBackgroundColor(Color.BLACK)
                    tvGridNum.setTextColor(Color.WHITE)
                }
            }else{
                //짝수 줄 처리
                if (tvGridNum.text.toString().toInt() / 6 == 1 || tvGridNum.text.toString().toInt() / 6 == 3){
                    if (tvGridNum.text.toString().toInt() % 2 != 0){
                        grid.setBackgroundColor(Color.BLACK)
                        tvGridNum.setTextColor(Color.WHITE)
                    }
                }else{
                    //홀수 줄 처리
                    if (tvGridNum.text.toString().toInt() % 2 == 0){
                        grid.setBackgroundColor(Color.BLACK)
                        tvGridNum.setTextColor(Color.WHITE)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeGridDataViewHolder {
        val layout = ChallengeGridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  ChallengeGridDataViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ChallengeGridDataViewHolder, position: Int) {
        holder.bind(challengeGridList[position])
    }

    override fun getItemCount(): Int {
        return challengeGridList.size
    }
}