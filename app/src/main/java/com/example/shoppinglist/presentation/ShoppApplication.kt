package com.example.shoppinglist.presentation

import android.app.Application
import com.example.shoppinglist.di.DaggerApplicationComponent

class ShoppApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}