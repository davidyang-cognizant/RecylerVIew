package com.example.recylerview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(@StringRes val stringResourceId: Int, @StringRes val stringTitleId: Int, @DrawableRes val imageResourceId: Int, val rating: Double) {
}

