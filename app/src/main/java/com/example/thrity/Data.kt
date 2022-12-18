package com.example.thrity

import android.media.Image

data class Data(
    val title: String,
    val desc: String,
)

data class noticeData(
    val desc: String,
    val date: String,
)

data class ComData(
    val id: String,
    val challenge: String,
    val num: String,
    val title: String,
    //val image: Image,
    val desc: String,
    val date: String,
)

data class ChallengeGridData(
    val num: String,
)
