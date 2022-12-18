package com.example.thrity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.databinding.ChallengeGridItemBinding

class ListChallengeGridAdaptor (var challengeGridList: ArrayList<ChallengeGridData>): RecyclerView.Adapter<ListChallengeGridAdaptor.ChallengeGridDataViewHolder>(){

    inner class ChallengeGridDataViewHolder(private val viewBinding: ChallengeGridItemBinding) : RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: ChallengeGridData) = with(viewBinding){
            tvGridNum.text = data.num
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeGridDataViewHolder {
        val layout = ChallengeGridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        val grid = ()
//        if ((layout.tvGridNum)%2 == 0){
//            layout.grid.SetBackgroundColor
//        }
        return  ChallengeGridDataViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ChallengeGridDataViewHolder, position: Int) {
        holder.bind(challengeGridList[position])
    }

    override fun getItemCount(): Int = challengeGridList.size
}