//package com.hilt.compnavigte.search.domain.model
package feature/search/domain/model/DomainModelFile.kt


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

