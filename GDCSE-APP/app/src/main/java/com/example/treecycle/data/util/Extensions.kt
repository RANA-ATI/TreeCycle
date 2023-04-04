package com.example.treecycle.data.util

import android.app.Activity
import android.content.Context
import android.content.res.ColorStateList
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.core.view.WindowInsetsControllerCompat

fun Activity.changeStatusBarColor(color: Int, isLight: Boolean) {
    window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
    window.statusBarColor = color
    WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = isLight
}

fun Context.colorList(id: Int): ColorStateList {
    return ColorStateList.valueOf(ContextCompat.getColor(this, id))
}
