package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_meals_by_month.*

class MealsByMonth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals_by_month)
        SixMonthMeals()
    }

    private fun SixMonthMeals() {
        go_six_childmeal.setOnClickListener {
            val intent = Intent(this, ForSixMonth::class.java)
            startActivity(intent)
        }
    }




}