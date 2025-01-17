package com.akhmedmv.weatherapp.presentation.root

import com.arkivanov.decompose.ComponentContext

class DefaultRootComponentImpl(
    componentContext: ComponentContext
) : RootComponent, ComponentContext by componentContext {
}