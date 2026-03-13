package com.dnyfetch.codeeditor.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dnyfetch.codeeditor.R

class FileAdapter(private val context: Context, private val onClick: () -> Unit) :
    RecyclerView.Adapter<FileAdapter.ViewHolder>() {

    private val items = List(10) { "Project $it" }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_file, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text = items[position]
        holder.itemView.setOnClickListener { onClick() }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.findViewById(R.id.textView)
    }
}