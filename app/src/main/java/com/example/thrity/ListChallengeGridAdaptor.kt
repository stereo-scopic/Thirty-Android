package com.example.thrity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.databinding.ChallengeGridItemBinding

class ListChallengeGridAdaptor (var challengeGridList: ArrayList<ChallengeGridData>): RecyclerView.Adapter<ListChallengeGridAdaptor.ChallengeGridDataViewHolder>(){

    inner class ChallengeGridDataViewHolder(private val viewBinding: ChallengeGridItemBinding) : RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: ChallengeGridData) = with(viewBinding){
            tvGridNum.text = data.num
            if(tvGridNum.text.toString().toInt() % 6 == 0){
                if (tvGridNum.text.toString().toInt() / 6 != 2 && tvGridNum.text.toString().toInt() / 6 != 4){
                    grid.setBackgroundColor(Color.BLACK)
                    tvGridNum.setTextColor(Color.WHITE)
                }
            }else{
                if (tvGridNum.text.toString().toInt() / 6 == 1 || tvGridNum.text.toString().toInt() / 6 == 3){
                    if (tvGridNum.text.toString().toInt() % 2 != 0){
                        grid.setBackgroundColor(Color.BLACK)
                        tvGridNum.setTextColor(Color.WHITE)
                    }
                }else{
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