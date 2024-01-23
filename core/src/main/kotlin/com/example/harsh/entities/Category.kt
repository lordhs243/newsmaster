package com.example.harsh.entities

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "country")
data class Category (

    @Id
    @Column(name = "category_reference_id")
    var categoryReferenceId: UUID? = null,

    @Column(name = "category_name")
    var categoryName: String? = null,
)