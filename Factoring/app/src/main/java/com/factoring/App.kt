package com.factoring

import android.app.Application
import com.factoring.di.AppComponent
import com.factoring.di.AppModule
import com.factoring.di.DaggerAppComponent

class App : Application() {

    companion object {
        lateinit var component: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        component = createComponent()
        component.inject(this@App)
    }

    fun createComponent() =
        DaggerAppComponent.builder()
            .appModule(AppModule(this@App))
            .build()
}