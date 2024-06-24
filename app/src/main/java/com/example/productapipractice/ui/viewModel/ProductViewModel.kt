package com.example.productapipractice.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productapipractice.data.model.Product
import com.example.productapipractice.data.model.ProductX
import com.example.productapipractice.data.repository.ProductRepositoryImpementaion
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val repository: ProductRepositoryImpementaion
): ViewModel() {
    private val _products = MutableStateFlow<List<ProductX>>(emptyList())
    val products: StateFlow<List<ProductX>> = _products

    init{
        fetchProduct()

    }
    private fun fetchProduct(){
        viewModelScope.launch {
            repository.getProduct().collect { productList ->
                _products.value = productList

            }
        }


    }


}