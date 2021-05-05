package com.d3if0028.galerihewan.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.d3if0028.galerihewan.model.Hewan
import com.d3if0028.galerihewan.databinding.ListItemBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    //membuat recycleview
    class ViewHolder(private  val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(hewan: Hewan) = with(binding){
            tvNama.text = hewan.nama
            tvLatin.text = hewan.namaLatin
            imageView.setImageResource(hewan.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater = LayoutInflater.from(parent.context)
       val binding = ListItemBinding.inflate(inflater,parent,false)
       return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.bind(data[position])
    }

    override fun getItemCount(): Int {
       return data.size
    }

    private val data = mutableListOf<Hewan>()

    fun updateData(newData: List<Hewan>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }
}