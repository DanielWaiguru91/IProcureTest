package com.danielwaiguru.presentation.di

import com.danielwaiguru.data.di.dataModules
import com.danielwaiguru.presentation.add_products.AddProductViewModel
import com.danielwaiguru.presentation.dashboard.DashBoardViewModel
import com.danielwaiguru.presentation.products.ProductsViewModel
import com.danielwaiguru.presentation.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModels = module {
    viewModel { DashBoardViewModel() }
    viewModel { AddProductViewModel(get()) }
    viewModel { ProductsViewModel(get()) }
    viewModel { SearchViewModel(get()) }
}
val appModules = listOf(viewModelModels) + dataModules