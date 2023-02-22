package com.example.thrity.Explore.Adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.ChallengeAddGridData
import com.example.thrity.databinding.ListExploreItemBinding

class ListChallengeTitleAdaptor (var challengeTitleList: ArrayList<ChallengeAddGridData>): RecyclerView.Adapter<ListChallengeTitleAdaptor.ListChallengeTitleViewHolder>(){
    inner class ListChallengeTitleViewHolder(private val viewBinding: ListExploreItemBinding) : RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: ChallengeAddGridData) = with(viewBinding){
            tvNum.text = data.num
            tvTitle.text = data.title
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListChallengeTitleViewHolder {
        val layout = ListExploreItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListChallengeTitleViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ListChallengeTitleViewHolder, position: Int) {
        holder.bind(challengeTitleList[position])
    }

    override fun getItemCount(): Int {
        return challengeTitleList.size
    }
}

