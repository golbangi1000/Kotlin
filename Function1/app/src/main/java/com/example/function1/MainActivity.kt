package com.example.function1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.function1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button.setOnClickListener {
            show("안녕")
        }
        binding.button2.setOnClickListener {
            val firstStr = binding.input1.text.toString()
            val secondStr = binding.input2.text.toString()


            val first = firstStr.toInt()
            val second = secondStr.toInt()


            val result = add(first, second)
            binding.output1.text = "더하기 결과: $result"
        }

        binding.button3.setOnClickListener {
            val result = add(getFirst(), getSecond())
            val result2 = add(a = 10, b = 10)

            binding.output1.text = "더하기 결과: $result"

            sum(10, 20 , 30, 40)
        }

    }


    fun sum(vararg inputs:Int):Int{
        var output = 0
        for(num in inputs){
            output = output + num
        }
        return output

    }
    fun getFirst(): Int {
        // binding = ActivityMainBinding.inflate(layoutInflater)

        val firstStr = binding.input1.text.toString()
        return firstStr.toInt()
    }

    fun getSecond(): Int {
        // binding = ActivityMainBinding.inflate(layoutInflater)

        val secondStr = binding.input2.text.toString()
        return secondStr.toInt()
    }

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    //함수는 fun으로 시작
    fun show(message: String) {
        println("버튼이 눌렸어요 : $message")
    }
}