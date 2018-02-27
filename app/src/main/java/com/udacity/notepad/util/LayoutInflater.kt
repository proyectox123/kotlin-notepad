package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by mauricio.hernandez on 26/02/2018.
 */
val Context.layoutInflater get() = LayoutInflater.from(this)