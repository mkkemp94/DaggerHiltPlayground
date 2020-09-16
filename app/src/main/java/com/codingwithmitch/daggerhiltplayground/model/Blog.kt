package com.codingwithmitch.daggerhiltplayground.model

// Domain
data class Blog(
    var id: Int,
    var title: String,
    var body: String,
    var image: String,
    var category: String
)