package com.cronocode.intentrecyclerview.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cronocode.intentrecyclerview.ChildActivity
import com.cronocode.intentrecyclerview.R
import kotlinx.android.synthetic.main.activity_addchild.*

class AddchildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addchild)
       setupViewsthree()
    }

    private fun setupViewsthree() {
        add_child_skip.setOnClickListener {
            val intent = Intent(this, ChildActivity::class.java)
            startActivity(intent)
        }
    }
}