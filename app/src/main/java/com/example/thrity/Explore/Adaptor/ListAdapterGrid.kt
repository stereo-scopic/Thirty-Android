package com.example.thrity.Explore.Adaptor

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thrity.Explore.ChallengeDetail
import com.example.thrity.Data
import com.example.thrity.databinding.ListGridItemBinding

class ListAdapterGrid (var list: ArrayList<Data>): RecyclerView.Adapter<ListAdapterGrid.DataViewHolder>(){

    inner class DataViewHolder(private val viewBinding: ListGridItemBinding): RecyclerView.ViewHolder(viewBinding.root) {
        private val context = viewBinding.root.context
        fun bind(data: Data) = with(viewBinding) {
            tvListTitle.text = data.title
            tvListDes.text = data.desc

            itemView.setOnClickListener {
                viewBinding.imgCheck.visibility = View.VISIBLE
                viewBinding.btnAdd.visibility = View.GONE
                val intent = Intent(context, ChallengeDetail::class.java)
                //intent.putExtra("data", item);
                intent.run { context.startActivity(this) }
            }
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