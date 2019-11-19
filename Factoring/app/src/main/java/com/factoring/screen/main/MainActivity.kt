package com.factoring.screen.main

import com.factoring.App
import com.factoring.R
import com.factoring.screen.base.BaseActivity
import com.factoring.utils.isNumberFactoringNotValid
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<Presenter>(), View {

    override fun getLayout() = R.layout.activity_main

    override fun setupComponent() =
        DaggerMainComponent.builder()
            .appComponent(App.component)
            .mainModule(MainModule(this@MainActivity))
            .build()
            .inject(this@MainActivity)

    override fun initUI() {
        button_ok_AM.setOnClickListener {
            val numberFactoring = edit_text_number_AM.text.toString()

            if (numberFactoring.isNumberFactoringNotValid()) {
                edit_text_number_AM.error = resources.getString(R.string.ma_hint_input_number)
                text_view_result_AM.visibility = android.view.View.INVISIBLE
                return@setOnClickListener
            }

            val resultFactors = presenter.factor(numberFactoring.toInt()).toString()

            text_view_result_AM.visibility = android.view.View.VISIBLE
            text_view_result_AM.text = String.format(resources.getString(R.string.ma_result), resultFactors)
        }
    }
}
