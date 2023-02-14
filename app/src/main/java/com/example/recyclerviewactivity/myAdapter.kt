package com.example.recyclerviewactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val names: List<Name>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val response = names[position]
        with(holder){
            uiTvName.text = response.username
            uiTvEmail.text = names[position].email
        }

    }

    override fun getItemCount(): Int {
        return this.names.size
    }

    class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var uiTvName: TextView = itemView.findViewById(R.id.uiTvName)
        var uiTvEmail: TextView = itemView.findViewById(R.id.uiTvEmail)
    }
}

