package com.factoring.screen.main

import com.factoring.di.AppComponent
import com.factoring.di.ViewScope
import dagger.Component
import dagger.Module
import dagger.Provides

@ViewScope
@Component(dependencies = [AppComponent::class], modules = [MainModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}

@Module
class MainModule(val view: View) {

    @Provides
    @ViewScope
    fun provideMainPresenter(): Presenter {
        return MainPresenter(view)
    }
}