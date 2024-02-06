package com.example.harsh.contract

import java.util.UUID

data class DBCategoryListView (
    val categoryList: List<Category> = emptyList(),
)
data class Category(
    val categoryReferenceId: UUID?,
    val categoryName: String?,
)