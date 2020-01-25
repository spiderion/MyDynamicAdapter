package com.example.mydynamicadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DynamicAdapter(private val listener: Any? = null) :
    RecyclerView.Adapter<AbstractViewHolder>() {

    val items = arrayListOf<DynamicItem>()

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): AbstractViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(items[position].getTypeLayout(), parent, false)
        return items[position].getViewHolder(view, listener)
    }

    override fun getItemViewType(position: Int) = position

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: AbstractViewHolder, position: Int) {
        holder.onBind(items[position])
    }
}