package com.codingwithmitch.daggerhiltplayground.repository

import com.codingwithmitch.daggerhiltplayground.retrofit.BlogRetrofit
import retrofit2.Retrofit
import javax.inject.Inject

class MainRepository
@Inject
constructor(
    private val retrofit: BlogRetrofit
)