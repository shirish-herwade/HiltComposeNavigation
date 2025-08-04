package feature1.search.data.repository

class SearchRepoImpl : SearchRepository {
    private val searchApiService = SearchApiService()
    override fun getRecipes(): List<Recipe> {
        return searchApiService.getRecipes(s)
    }

    override fun getRecipeDetails(recipeId: String): RecipeDetails {

    }
}
