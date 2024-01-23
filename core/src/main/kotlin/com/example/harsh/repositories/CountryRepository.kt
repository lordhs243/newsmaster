package com.example.harsh.repositories

import com.example.harsh.entities.Country
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CountryRepository : JpaRepository<Country, Long> {
}