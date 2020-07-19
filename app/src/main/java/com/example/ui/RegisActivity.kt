package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regis.*

class RegisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)


        ok.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }

        cancle.setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

