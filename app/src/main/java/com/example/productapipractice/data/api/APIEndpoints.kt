package com.example.productapipractice.data.api

import com.example.productapipractice.data.model.ProductX
import retrofit2.http.GET

interface APIEndpoints {

    @GET(APIDetails.PRODUCT_ENDPOINT)
    suspend fun getProduct(): ProductX
}