package com.nrup.mysampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val tvHello = findViewById<TextView>(R.id.textView)
//        tvHello.text = GetMyProfileDetails.getMyDetails()
//        Log.d("TAG","Data"+GetMyProfileDetails.getMyDetails())
    }
}