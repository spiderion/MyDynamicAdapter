package com.example.mydynamicadapter

import android.view.View
import kotlinx.android.synthetic.main.item_user.view.*

class ItemUser2(val name: String) : DynamicItem {

    override fun getTypeLayout() = ItemUserViewHolder2.LAYOUT

    override fun getViewHolder(view: View, listener: Any?): AbstractViewHolder =
        ItemUserViewHolder2(view)
}


class ItemUserViewHolder2(view: View) : AbstractViewHolder(view) {

    override fun onBind(dynamicItem: DynamicItem) {
        if (dynamicItem is ItemUser2) {
            itemView.userName.text = dynamicItem.name
        }
    }


    companion object {
        const val LAYOUT = R.layout.item_user2
    }
}