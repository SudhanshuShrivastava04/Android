package com.example.framelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        push.setOnClickListener{
            fire.setImageResource(R.drawable._a29e1a37a9239_5983790215126941795021)
        }
    }
}
