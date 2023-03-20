package com.example.hello

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener {
            Toast.makeText(applicationContext, " 버튼이 눌렸다.",
            Toast.LENGTH_LONG).show()
        }

        button4.setOnClickListener {
           val input2 = input1.text.toString()
            output1.text = "결과 : $input2"

        }
    }
}