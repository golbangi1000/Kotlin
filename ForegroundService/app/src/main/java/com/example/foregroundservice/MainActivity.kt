package com.example.foregroundservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun start(view:View){
        val intent = Intent(this,Foreground::class.java)
        ContextCompat.startForegroundService(this, intent)
    }

    fun serviceStop(view:View){
        val intent = Intent(this, Foreground::class.java)
    }
}