package com.example.thrity.My.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.databinding.ListNoticeItemBinding
import com.example.thrity.noticeData

class ListNoticeAdaptor (private val noticeList: ArrayList<noticeData>) : RecyclerView.Adapter<ListNoticeAdaptor.noticeDataViewHolder>(){
    inner class noticeDataViewHolder(private val viewBinding: ListNoticeItemBinding) : RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: noticeData) = with(viewBinding){
            tvNoticeDesc.text = data.desc
            tvNoticeDate.text = data.date
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): noticeDataViewHolder {
        val viewBinding = ListNoticeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return noticeDataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: noticeDataViewHolder, position: Int) {
        holder.bind(noticeList[position])
    }

    override fun getItemCount(): Int = noticeList.size
}