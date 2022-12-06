package com.example.thrity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.databinding.ListGridItemBinding

class ListAdapterGrid (var list: ArrayList<String>): RecyclerView.Adapter<ListAdapterGrid.GridAdapter>(){

    class GridAdapter(val layout: ListGridItemBinding): RecyclerView.ViewHolder(layout.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridAdapter {
        val layout = ListGridItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return GridAdapter(layout)
    }

    override fun onBindViewHolder(holder: GridAdapter, position: Int) {
        holder.layout.tvListTitle.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
}