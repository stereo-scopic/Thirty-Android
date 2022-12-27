package com.example.thrity.Challenge.Adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.ChallengeListData
import com.example.thrity.R
import com.example.thrity.databinding.ListChallengeItemBinding

class ListChallengeAdaptor (private val challengeList: ArrayList<ChallengeListData>, val itemClick: (ChallengeListData) -> Unit) : RecyclerView.Adapter<ListChallengeAdaptor.ChallengeListDataViewHolder>(){
    inner class ChallengeListDataViewHolder(private val viewBinding: ListChallengeItemBinding, itemClick: (ChallengeListData) -> Unit) : RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: ChallengeListData) = with(viewBinding){
            tvChallengeListTitle.text = data.title

            itemView.setOnClickListener {
                viewBinding.layoutItem.setBackgroundResource(R.drawable.challenge_list_stroke)
                itemClick(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeListDataViewHolder {
        val viewBinding = ListChallengeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChallengeListDataViewHolder(viewBinding, itemClick)
    }

    override fun onBindViewHolder(holder: ChallengeListDataViewHolder, position: Int) {
        holder.bind(challengeList[position])
    }

    override fun getItemCount(): Int = challengeList.size
}