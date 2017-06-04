package com.capsule.patterns.datamapper

data class DataMapperException(override val message: String): RuntimeException(message)
