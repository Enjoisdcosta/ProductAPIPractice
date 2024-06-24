package com.example.productapipractice.data.repository

import com.example.productapipractice.data.model.Product
import com.example.productapipractice.data.model.ProductX
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    suspend fun getProduct(): Flow<List<ProductX>>
}