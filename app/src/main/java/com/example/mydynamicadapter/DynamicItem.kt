package com.example.mydynamicadapter

import android.view.View

interface DynamicItem {
    fun getTypeLayout(): Int
    fun getViewHolder(view: View, listener: Any?): AbstractViewHolder
}