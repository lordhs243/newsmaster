package com.example.harsh

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.example.harsh"])
@EntityScan(basePackages = ["com.example.harsh"])
class NewsMasterApplication {}

fun main(args: Array<String>) {
  runApplication<NewsMasterApplication>(*args)
}