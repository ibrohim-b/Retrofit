package com.example.retrofit

import retrofit2.http.GET

interface APIinterface {
    @GET("filter.php?c=Cocktail")
    suspend  fun getCategories(): Dto
}