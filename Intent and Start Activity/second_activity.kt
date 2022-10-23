package com.example.intentandstartingactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class second_activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        exit.setOnClickListener{
            finish()
            System.exit(0)
        }
    }

}
