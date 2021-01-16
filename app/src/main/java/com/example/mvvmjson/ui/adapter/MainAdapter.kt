package com.example.mvvmjson.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmjson.R
import com.example.mvvmjson.model.Post

class MainAdapter(private val post: ArrayList<Post>) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
       ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int =post.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text = post[position].userId
        holder.id.text = post[position].id
        holder.body.text = post[position].body
        holder.title.text  = post[position].title
    }

    fun addUsers(post: List<Post>) {
        this.post.apply {
            clear()
            addAll(post)
        }

    }
}