package com.example.harsh.controller

import com.example.harsh.service.ConstantsService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/constants")
class ConstantsController (
    private val constantsService: ConstantsService
) {
    @GetMapping("/get-countries")
    fun getCountryCodesFromConstants() : ResponseEntity<*> {
        return ResponseEntity.ok(constantsService.getCountryList())
    }

    @GetMapping("/get-categories")
    fun getCategoriesFromConstants() : ResponseEntity<*> {
        return ResponseEntity.ok(constantsService.getCategoryList())
    }
}