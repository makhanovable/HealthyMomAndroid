package kz.healthymom.presentation.calendar

import android.os.Bundle
import android.view.View
import kz.healthymom.R
import kz.healthymom.presentation.base.BaseFragment

/**
 * created by: Makhanov Madiyar
 * on: 18.04.2021
 */
class CalendarFragment : BaseFragment(R.layout.f_calendar) {
    companion object {
        fun newInstance() = CalendarFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        observeLiveData()
    }

    private fun initUI() {

    }

    private fun observeLiveData() {

    }
}