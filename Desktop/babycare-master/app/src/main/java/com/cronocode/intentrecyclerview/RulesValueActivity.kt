package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_rules_value.*

class RulesValueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules_value)
        setupViewsMealsArticle()
        BreestFeedArticle()
        GoNextArticle()
    }

    private fun setupViewsMealsArticle() {
        meal_article_fromrv.setOnClickListener {
            val intent = Intent(this, RulesValueFoodTwo::class.java)
            startActivity(intent)
        }
    }

    private fun BreestFeedArticle() {
        go_breastfeeding_article.setOnClickListener {
            val intent = Intent(this, BreastFeedingActvity::class.java)
            startActivity(intent)
        }
    }

    private fun GoNextArticle() {
        go_next_meal_article.setOnClickListener {
            val intent = Intent(this, MealsByMonth::class.java)
            startActivity(intent)
        }
    }


}