package com.hilt.compnavigate.search.data.di

import androidx.room.Query

interface `SearchApiService.kt` {

    //https://themealdb.com/api/json/v1/1/search.php?s=chicken

    @GET("api/json/v1/1/search.php?")
    suspend fun getRespices(
        @Query("s") s: String
    ): Response<RecipeResponse>

    //    //https://themealdb.com/api/json/v1/1/lookup.php?i=52772

    @GET("api/json/v1/1/lookup.php?")
    suspend fun getRecipeDetails(
        @Query("i") i: String
    ): Response<RecipeDetailsResponse>


}