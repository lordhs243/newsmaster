package com.example.harsh.contract

import java.util.UUID

data class DBCountryListView (
    val countryList: List<Country> = emptyList(),
)

data class Country(
    val countryReferenceId: UUID?,
    val countryName: String?,
    val countryCode: String?
)