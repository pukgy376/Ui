package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val type = arrayOf("อุทกภัย","ภัยแล้ง","วาตภัย","ภัยหนาว","ไฟป่า","อัคคีภัย","แผ่นดินไหว","ดินถล่ม/โคลนถล่ม","อาคารถล่ม/ทรุด","ภัยจากการคมนาคมขนส่ง","ภัยสารเคมี","วัตถุอันตราย","ภัยจากการก่อกวนความไม่สงบ/วินาศกรรม","ภัยทางธรรมชาติ","ภัยอื่นๆ")
        val arrayAdapter1 = ArrayAdapter(this,android.R.layout.simple_spinner_item,type)
       //atatched arrayadapter to spinner
        spinner.adapter = arrayAdapter1

        val level = arrayOf("น้อย","ปานกลาง","มาก","มากที่สุด")
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,level)
        //atatched arrayadapter to spinner
        spinner2.adapter = arrayAdapter


       buttonNext.setOnClickListener {
           var show = Intent(applicationContext,ShowPostActivity::class.java)
           startActivity(show)
       }

        buttonOther.setOnClickListener {
            var other = Intent(applicationContext,All_Activity::class.java)
            startActivity(other)
        }

        buttonLogin.setOnClickListener {
            var login = Intent(applicationContext,LoginActivity::class.java)
            startActivity(login)
        }
    }

}
