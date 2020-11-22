package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_breast_feeding_actvity.*
import kotlinx.android.synthetic.main.activity_child.*

class BreastFeedingActvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_breast_feeding_actvity)
        GoMealsByMonth()
    }



    private fun GoMealsByMonth() {
        go_next_p.setOnClickListener {
            val intent = Intent(this, MealsByMonth::class.java)
            startActivity(intent)
        }
    }
}