package com.example.harsh.service

import com.example.harsh.constants.Constants.categoriesList
import com.example.harsh.constants.Constants.countryCodesList
import com.example.harsh.contract.ConstantOrCsvCategoryListView
import com.example.harsh.contract.ConstantOrCsvCountryListView
import org.springframework.stereotype.Service

@Service
class ConstantsService {

    fun getCountryList(): ConstantOrCsvCountryListView {
        return ConstantOrCsvCountryListView(countryList = countryCodesList)
    }

    fun getCategoryList(): ConstantOrCsvCategoryListView {
        return ConstantOrCsvCategoryListView(categoryList = categoriesList)
    }
}