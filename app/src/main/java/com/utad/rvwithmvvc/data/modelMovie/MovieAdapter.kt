package com.utad.rvwithmvvc.data.modelMovie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.utad.rvwithmvvc.R

class MovieAdapter(private var list: List<Movie>): RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(layoutInflater.inflate(R.layout.item_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = list[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    fun submitList(languagesList: MutableList<Movie>) {
        this.list = languagesList
    }

}