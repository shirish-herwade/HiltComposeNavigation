package gaur.himanshu.searchrecipeapp.search.domain.repository

interface SearchRepository {
    suspend fun getRecipes(): List<Receipe>
    suspend fun getRecipeDetails(id: String): ReceipeDetails
}
