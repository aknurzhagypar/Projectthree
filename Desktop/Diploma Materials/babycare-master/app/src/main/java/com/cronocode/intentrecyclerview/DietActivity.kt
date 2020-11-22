package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_diet.*
import kotlinx.android.synthetic.main.activity_meals_by_month.*

class DietActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet)
        SixMonthMealsTwo()
    }

    private fun SixMonthMealsTwo() {
        go_child_meal_article.setOnClickListener {
            val intent = Intent(this, ForSixMonthActivity::class.java)
            startActivity(intent)
        }
    }
}