package com.example.harsh.entities

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "country")
class Country : BaseEntity() {

    @Id
    @Column(name = "country_reference_id")
    var countryReferenceId: UUID? = null

    @Column(name = "country_name")
    var countryName: String? = null

    @Column(name = "country_code")
    var countryCode: String? = null
}