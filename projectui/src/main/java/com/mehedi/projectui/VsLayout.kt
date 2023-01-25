package com.mehedi.projectui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class VsLayout : ConstraintLayout {
    private lateinit var mLayout: ConstraintLayout
    private lateinit var imageG1: ImageView
    private lateinit var imageG2: ImageView

    constructor(context: Context) : super(context) {
        initView(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        getResFromXml(context, attrs)
        initView(context)
    }

    private fun initView(context: Context) {
        layoutParams = LayoutParams(
            android.view.ViewGroup.LayoutParams.MATCH_PARENT,
            android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        )

        LayoutInflater
            .from(context)
            .inflate(R.layout.vslayout, this, true)

        mLayout = findViewById(R.id.mLayout)
        imageG1 = findViewById(R.id.group1)
        imageG2 = findViewById(R.id.group2)


    }


    fun setGroup1Image(resId: Int) {
        imageG1.setImageResource(resId)
    }

    fun setGroup2Image(resId: Int) {
        imageG2.setImageResource(resId)
    }

    private fun getResFromXml(context: Context, attrs: AttributeSet) {
        val data = context.obtainStyledAttributes(attrs, R.styleable.VsLayout)
           data.recycle()
    }

}