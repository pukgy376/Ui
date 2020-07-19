package com.example.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_other.*
import java.util.ArrayList

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        val recycleListView = findViewById(R.id.recyclerView) as RecyclerView

        recycleListView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        val other = ArrayList<Other>()
        other.add(Other("เหตุด่วนเหตุร้าย","191"))
        other.add(Other("เหตุเพลิงไหม้","199"))
        other.add(Other("แพทย์ฉุกเฉิน","1669"))
        other.add(Other("ตำรวจท่องเที่ยว","1155"))
        other.add(Other("แจ้งคนหาย","1300"))
        other.add(Other("แจ้งรถหาย","1192"))
        other.add(Other("กรมทางหลวงชนบท","1146"))
        other.add(Other("จส.100","1808"))
        other.add(Other("อุบัติเหตุทางน้ำ","1196"))
        other.add(Other("จราจร","1197"))
        other.add(Other("ศูนย์เตือนภัยแห่งชาติ","192"))


        val adapter = OtherAdapter(other)
        recyclerView.adapter = adapter
    }
}
