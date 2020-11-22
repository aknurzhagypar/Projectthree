package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_for_six_month.*
import kotlinx.android.synthetic.main.activity_home.*

class ForSixMonth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_six_month)
        GoDietActivity()
    }

    private fun GoDietActivity() {
        go_diet_page.setOnClickListener {
            val intent = Intent(this, DietActivity::class.java)
            startActivity(intent)
        }
    }


}