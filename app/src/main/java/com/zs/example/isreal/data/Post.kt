package com.zs.example.isreal.data

data class Post(
    var id: Long,
    var title: String,
    var rumors: ArrayList<Rumor>
)