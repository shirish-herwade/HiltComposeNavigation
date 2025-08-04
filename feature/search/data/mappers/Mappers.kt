package com.hilt.compnavigate.search.data.mappers

import com.hilt.compnavigate.search.data.model.RecipeDTO

//import com.hilt.compnavigate.search.data.model.RecipeDTO
//import com.hilt.compnavigate.search.domain.model.DomainModelFile.Recipe

fun List<RecipeDTO>.toDomain() : List<Recipe> = map {
    Recipe(
        id = it.id,
        strArea = it.strArea,
        title = it.title,
        image = it.image,
    )
}