package com.example.harsh.entities

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.MappedSuperclass
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Column
import javax.persistence.Version

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    open var id: Long? = null

    @CreationTimestamp
    @Column(updatable = false)
    open var createdAt: LocalDateTime? = null

    @UpdateTimestamp
    open var updatedAt: LocalDateTime? = null

    @Version
    open var version: Int? = null
}