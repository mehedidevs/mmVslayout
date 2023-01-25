package com.ju.k_multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehedi.projectui.VsLayout

class MainActivity : AppCompatActivity() {

    lateinit var vsLayout: VsLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        vsLayout = findViewById(R.id.vsView)
        vsLayout.setGroup1Image(R.drawable.bd_flg)
        vsLayout.setGroup2Image(R.drawable.nz_flg)

        var oo = VsLayout(this)
        var ooo = VsLayout(this,)


    }
}