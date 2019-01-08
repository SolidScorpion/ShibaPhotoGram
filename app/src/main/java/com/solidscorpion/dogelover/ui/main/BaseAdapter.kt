package com.solidscorpion.dogelover.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BaseAdapter(val data: MutableList<String>, ctx: Context) :
    RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(ctx)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = layoutInflater.inflate(android.R.layout.simple_list_item_1, parent, false)
        return BaseViewHolder(view)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.textView.text = data[position]
    }

    inner class BaseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(android.R.id.text1)
    }
}