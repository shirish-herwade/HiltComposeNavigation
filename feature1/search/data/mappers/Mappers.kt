package feature1.search.data.mappers

//import com.hilt.compnavigate.search.data.model.RecipeDTO
import feature1.search.data.model.RecipeDTO
import feature1.search.domain.model1.Recipe

//import com.hilt.compnavigate.search.data.model.RecipeDTO
//import com.hilt.compnavigate.search.domain.model.DomainModelFile.Recipe

fun List<RecipeDTO>.toDomain() : List<Recipe> = map {
    Recipe(
        id = it.id,
        strArea = it.strArea,
        title = it.title,
        image = it.image,
        idMeal = it.idMeal,
        strMeal = it.strMeal,
        strMealThumb = it.strMealThumb,
        strCategory = it.strCategory,
        strTags = it.strTags,
        strYoutube = it.strYoutube,
        strInstructions = it.strInstructions,
    )
}