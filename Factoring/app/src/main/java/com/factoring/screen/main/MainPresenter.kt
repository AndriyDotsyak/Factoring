package com.factoring.screen.main

import com.factoring.screen.base.BasePresenter
import javax.inject.Inject

class MainPresenter @Inject constructor(view: View)
    : BasePresenter<View>(view), Presenter {


    override fun factor(x: Int): List<Int> {
        val result: MutableList<Int> = mutableListOf()
        var number = x
        var divider = 2

        if (number < 2) return listOf(number)

        while (number != 1) {
            if (number % divider != 0) {
                divider++
            } else {
                number /= divider
                result.add(divider)
            }
        }

        return result
    }
}