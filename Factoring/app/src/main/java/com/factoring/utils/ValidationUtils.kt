package com.factoring.utils

import android.text.TextUtils

fun String.isNumberFactoringNotValid() = TextUtils.isEmpty(this) || this == 0.toString()