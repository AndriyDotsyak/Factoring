package com.factoring.di

import android.content.Context
import com.factoring.App
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(app: App)
    fun getAppContext(): Context
}

@Module
class AppModule(val app: App) {

    @Provides
    @Singleton
    fun provideApplication() = app

    @Provides
    @Singleton
    fun provideApplicationContext(): Context {
        return app.applicationContext
    }
}