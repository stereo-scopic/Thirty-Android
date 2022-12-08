package com.example.thrity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.databinding.ListCommunityItemBinding
import com.example.thrity.databinding.ListNoticeItemBinding

class ListCommunityAdaptor (private val communityList: ArrayList<ComData>) : RecyclerView.Adapter<ListCommunityAdaptor.ComDataViewHolder>() {
    inner class ComDataViewHolder(private val viewBinding: ListCommunityItemBinding) : RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: ComData) = with(viewBinding) {
            tvId.text = data.id
            tvIdChallenge.text = data.challenge
            tvNum.text = data.num
            tvChallengeTitle.text = data.title
//            imageView. = data.image
            tvCommunityDesc.text = data.desc
            tvDate.text = data.date
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComDataViewHolder {
        val viewBinding = ListCommunityItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ComDataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ComDataViewHolder, position: Int) {
        holder.bind(communityList[position])
    }

    override fun getItemCount(): Int = communityList.size

}