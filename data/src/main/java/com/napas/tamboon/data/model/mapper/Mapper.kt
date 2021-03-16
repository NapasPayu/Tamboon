package com.napas.tamboon.data.model.mapper

interface Mapper<E, D> {
    fun map(input: E): D
}