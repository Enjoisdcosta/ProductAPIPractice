package com.example.productapipractice.data.repository

import com.example.productapipractice.data.api.APIEndpoint
import com.example.productapipractice.data.model.ProductX
import javax.inject.Inject


class ProductRepositoryImpementaion @Inject constructor(
    private val apiDetail: APIEndpoint
): ProductRepository{
    override suspend fun getProduct(): ProductX {
        return apiDetail.getProduct()
    }
}