package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_all_.*

class All_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_)

        hotline.setOnClickListener {
            val i = Intent(this,OtherActivity::class.java)
            startActivity(i)
        }

        profile.setOnClickListener {
            val m = Intent(this,ProfileUserActivity::class.java)
            startActivity(m)
        }
    }
}