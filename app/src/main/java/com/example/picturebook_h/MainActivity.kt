package com.example.picturebook_h

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnprevious.setOnClickListener { it: View? ->
            startActivity(Intent(baseContext, MainActivity4::class.java))

        }
    }
}