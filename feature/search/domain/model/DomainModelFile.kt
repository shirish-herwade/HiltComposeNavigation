package gaur.himanshu.searchrecipeapp.search.domain.model

data class Receipe(
    val idMeal: String?,
    val strArea: String?,
    val strMeal: String?,
    val strMealThumb: String?,
    val strCategory: String?,
    val strTags: String?,
    val strYoutube: String?,
    val strInstructions: String?,
)

data class ReceipeDetails(
    val idMeal: String?,
    val strArea: String?,val strMeal: String?,
    val strMealThumb: String?,
    val strCategory: String?,
    val strTags: String?,
    val strYoutube: String?,
    val strInstructions: String?,
    val ingredientsPair: List<Pair<String, String>>
)

