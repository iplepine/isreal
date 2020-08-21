package com.zs.example.isreal.ui.post

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zs.example.isreal.data.Post

class PostViewModel : ViewModel() {
    val post: MutableLiveData<Post> = MutableLiveData()

    init {
    }
}
