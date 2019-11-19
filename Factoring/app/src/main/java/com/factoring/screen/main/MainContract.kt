package com.factoring.screen.main

import com.factoring.screen.base.BaseActivityContract


interface View : BaseActivityContract.View

interface Presenter : BaseActivityContract.Presenter {
    fun factor(x: Int): List<Int>
}