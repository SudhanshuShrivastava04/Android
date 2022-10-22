package com.example.toastandcontext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showtoast.setOnClickListener{
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = layoutInflater.inflate(R.layout.custom_toast,cltoast)
                show()
            }
        }
        exit.setOnClickListener{
            finish()
            System.exit(0)
        }
    }
}
