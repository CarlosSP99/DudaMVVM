package com.utad.rvwithmvvc.data.model

import com.google.gson.annotations.SerializedName

data class PageModel(
    @SerializedName (value="page")val page: Int,
    @SerializedName (value="results")val results: List<MovieModel>,
)
