package com.example.recyclerviewactivity

data class News (val totalResults: Int, val articles: List<Article>)

data class Article(
    val author: String, val title: String, val description: String
)