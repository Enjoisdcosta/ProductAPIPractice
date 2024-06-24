package com.example.productapipractice.data.repository

import com.example.productapipractice.data.model.ProductX

interface ProductRepository {

    suspend fun getProduct(): ProductX
}