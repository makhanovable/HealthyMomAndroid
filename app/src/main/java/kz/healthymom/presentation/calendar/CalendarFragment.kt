package kz.healthymom.presentation.calendar

import android.os.Bundle
import android.view.View
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import kotlinx.android.synthetic.main.f_calendar.*
import kz.healthymom.R
import kz.healthymom.presentation.base.BaseFragment

/**
 * created by: Makhanov Madiyar
 * on: 18.04.2021
 */
class CalendarFragment : BaseFragment(R.layout.f_calendar), SwipeRefreshLayout.OnRefreshListener {
    companion object {
        fun newInstance() = CalendarFragment()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initUI()
        observeLiveData()
    }

    private fun initUI() {
        swipe.setOnRefreshListener(this)
    }

    private fun observeLiveData() {

    }

    override fun onRefresh() {
        swipe.isRefreshing = false
    }
}