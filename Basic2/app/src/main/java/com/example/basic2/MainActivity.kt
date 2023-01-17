package com.example.basic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.basic2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            var name = binding.nameInput1.text.toString()
            var mobile =binding.mobileInput2.text.toString()

            Toast.makeText(applicationContext, "이름: $name, 전화번호: $mobile", Toast.LENGTH_LONG).show()


        }




    }
}