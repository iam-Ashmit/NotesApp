package com.ashmit.notesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ashmit.ashmitnotesapp.NotesModel

class RecyclerNotesAdapter(var context : Context, var arrNotes:ArrayList<NotesModel>) : RecyclerView.Adapter<RecyclerNotesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.txtViewTitleRC)
        val description = itemView.findViewById<TextView>(R.id.txtViewDescRC)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerNotesAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.notes_row, parent , false))
    }

    override fun onBindViewHolder(holder: RecyclerNotesAdapter.ViewHolder, position: Int) {
        holder.title.text = arrNotes[position].title
        holder.description.text = arrNotes[position].description
    }

    override fun getItemCount(): Int {
        return arrNotes.size
    }
}