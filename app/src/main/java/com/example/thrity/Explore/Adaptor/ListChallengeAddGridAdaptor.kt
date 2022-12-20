package com.example.thrity.Explore.Adaptor

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.ChallengeAddGridData
import com.example.thrity.R
import com.example.thrity.databinding.ListAddGridItemBinding

class ListChallengeAddGridAdaptor (var challengeAddGridList: ArrayList<ChallengeAddGridData>) : RecyclerView.Adapter<ListChallengeAddGridAdaptor.ChallengeAddGridDataViewHolder>() {
    inner class ChallengeAddGridDataViewHolder(private val viewBinding: ListAddGridItemBinding) : RecyclerView.ViewHolder(viewBinding.root){
        @SuppressLint("ResourceAsColor")
        fun bind(data: ChallengeAddGridData) = with(viewBinding){
            tvGridNum.text = data.num
            tvTitle.text = data.title

            //6의 배수 처리
            if(tvGridNum.text.toString().toInt() % 6 == 0){
                if (tvGridNum.text.toString().toInt() / 6 != 2 && tvGridNum.text.toString().toInt() / 6 != 4){
                    grid.setBackgroundColor(R.color.Gray_200)
                }
            }else{
                //짝수 줄 처리
                if (tvGridNum.text.toString().toInt() / 6 == 1 || tvGridNum.text.toString().toInt() / 6 == 3){
                    if (tvGridNum.text.toString().toInt() % 2 != 0){
                        grid.setBackgroundColor(R.color.Gray_200)
                    }
                }else{
                    //홀수 줄 처리
                    if (tvGridNum.text.toString().toInt() % 2 == 0){
                        grid.setBackgroundColor(R.color.Gray_200)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChallengeAddGridDataViewHolder {
        val layout = ListAddGridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChallengeAddGridDataViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ChallengeAddGridDataViewHolder, position: Int) {
        holder.bind(challengeAddGridList[position])
    }

    override fun getItemCount(): Int {
        return challengeAddGridList.size
    }
}