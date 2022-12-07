package com.example.thrity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.databinding.ListGridItemBinding

class ListAdapterGrid (var list: ArrayList<Data>): RecyclerView.Adapter<ListAdapterGrid.DataViewHolder>(){

    inner class DataViewHolder(private val viewBinding: ListGridItemBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: Data) = with(viewBinding) {
            tvListTitle.text = data.title
            tvListDes.text = data.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val layout = ListGridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(layout)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}