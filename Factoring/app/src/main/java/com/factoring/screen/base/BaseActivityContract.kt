package com.factoring.screen.base

import androidx.annotation.LayoutRes

interface BaseActivityContract {

    interface View {
        @LayoutRes
        fun getLayout(): Int
        fun setupComponent()
        fun initUI()
    }

    interface Presenter {
        fun onCreate()
        fun onStart()
        fun onStop()
        fun onDestroy()
    }
}