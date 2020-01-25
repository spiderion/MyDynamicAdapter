package com.example.mydynamicadapter

import android.view.View
import kotlinx.android.synthetic.main.item_user.view.*

class ItemUser(val name: String) : DynamicItem {

    override fun getTypeLayout() = ItemUserViewHolder.LAYOUT

    override fun getViewHolder(view: View, listener: Any?): AbstractViewHolder =
        ItemUserViewHolder(view, listener)
}


class ItemUserViewHolder(view: View, private val listener: Any?) : AbstractViewHolder(view) {

    override fun onBind(dynamicItem: DynamicItem) {
        if (dynamicItem is ItemUser && listener is View.OnClickListener) {
            itemView.userName.text = dynamicItem.name
            itemView.userName.setOnClickListener { listener.onClick(itemView) }
        }
    }


    companion object {
        const val LAYOUT = R.layout.item_user
    }

    //comment
}