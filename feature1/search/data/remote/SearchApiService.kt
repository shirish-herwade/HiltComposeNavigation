package feature1.search.data.remote

import com.hilt.compnavigate.search.data.model.RecipeDetailsResponse

//import androidx.room.Query

interface SearchApiService {

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