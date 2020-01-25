package com.example.mydynamicadapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class AbstractViewHolder(view: View) : RecyclerView.ViewHolder(view) {

   abstract fun onBind(dynamicItem: DynamicItem)
}