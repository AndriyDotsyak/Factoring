package com.factoring.screen.base

abstract class BasePresenter<V : BaseActivityContract.View>(val view : V) :
    BaseActivityContract.Presenter {

    override fun onCreate() {}

    override fun onStart() {}

    override fun onStop() {}

    override fun onDestroy() {}
}