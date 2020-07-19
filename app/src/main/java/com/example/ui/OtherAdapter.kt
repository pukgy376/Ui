package com.example.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OtherAdapter(val userList: ArrayList<Other>) : RecyclerView.Adapter<OtherAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.list_hotline, parent, false)
    return ViewHolder(v)
}

override fun getItemCount(): Int {
    return userList.size
}

override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val other: Other = userList[position]
    holder?.textViewName?.text = other.center
    holder?.textviewAddress?.text = other.call
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textViewName = itemView.findViewById(R.id.showcenter) as TextView
    val textviewAddress = itemView.findViewById(R.id.showcall) as TextView
}
}