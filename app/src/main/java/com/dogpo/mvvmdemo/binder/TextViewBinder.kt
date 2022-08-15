package com.dogpo.mvvmdemo.binder

import android.widget.TextView
import androidx.databinding.BindingAdapter

object TextViewBinder {
    @BindingAdapter(value = ["dotdot"], requireAll = false)
    fun formatDate(view: TextView, text: String?) {
        text?.let {
            text.plus("...")
            view.text = text
        }
    }
}
