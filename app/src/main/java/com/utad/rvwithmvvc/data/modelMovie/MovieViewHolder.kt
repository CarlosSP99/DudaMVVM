package com.utad.rvwithmvvc.data.modelMovie

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.utad.rvwithmvvc.databinding.ItemMovieBinding

class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){

    val binding = ItemMovieBinding.bind(view)
    private lateinit var movie: Movie

    fun render(item: Movie){
        movie = item
        binding.tvDate.text = item.releaseDate
        binding.tvTitle.text= item.title
        binding.tvOverview.text = item.overview
        binding.tvPopularity.text = item.popularity.toString()
        binding.ivPoster.
    }
}