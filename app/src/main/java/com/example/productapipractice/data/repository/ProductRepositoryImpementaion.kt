package com.example.productapipractice.data.repository

import com.example.productapipractice.data.api.APIEndpoints
import com.example.productapipractice.data.model.Product
import com.example.productapipractice.data.model.ProductX
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class ProductRepositoryImpementaion @Inject constructor(
    private val apiDetail: APIEndpoints
): ProductRepository{
    override suspend fun getProduct(): Flow<List<ProductX>> = flow {
       val productResponse = apiDetail.getProduct()
        emit(productResponse.products)
    }
}