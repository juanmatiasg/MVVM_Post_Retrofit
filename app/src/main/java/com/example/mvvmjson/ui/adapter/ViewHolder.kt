package com.example.mvvmjson.ui.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmjson.R

class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val userId = view.findViewById<TextView>(R.id.userId)
    val id = view.findViewById<TextView>(R.id.textViewId)
    val body = view.findViewById<TextView>(R.id.body)
    val title = view.findViewById<TextView>(R.id.title)
}