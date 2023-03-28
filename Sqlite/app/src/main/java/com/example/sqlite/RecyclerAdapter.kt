package com.example.sqlite

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import

class RecyclerAdapter : RecyclerView.Adapter<Holder> {
        var listData = mutableListOf<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

    }

    override fun getItemCount(): Int {
    }
}

class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun setMemo(memo: Memo){
        itemView.textNo.text = "${momo.no}"
        itemView.textcontent.text = "${}"


    }
}