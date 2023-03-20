package com.example.layoutt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.layoutt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val listener = object : View.OnClickListener {
//
//            override fun onClick(v: View?) {
//                Log.d("리스너", "클릭돼었습니다")
//
//            }
//        }

        binding.button.setOnClickListener(listener)

    }
}