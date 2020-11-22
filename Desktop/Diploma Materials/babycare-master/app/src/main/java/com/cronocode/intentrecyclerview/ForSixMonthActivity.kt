package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_for_six_month2.*
import kotlinx.android.synthetic.main.activity_home.*

class ForSixMonthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_six_month2)
        GoHomePage()
    }

    private fun GoHomePage() {
        go_home.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}