package com.example.basic3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basic3.constants.mBonus
import com.example.basic3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    companion object{
        const val BONUS = 100
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.addButton.setOnClickListener {
            val firstStr = binding.input1.text.toString()
            val secondStr = binding.input2.text.toString()


            var first = firstStr.toInt()
            var second = secondStr.toInt()

                                                                //코틀린은 class에 안들어있어도 import해서 바로 쓸수있음
                                                                // 밑에 mBonus
                                                                //패키지 변수
            val result = first + second + MainActivity.BONUS + mBonus

            binding.output.text = "결과 : $result"




//            if (result == 20){
//                binding.output.append("더하기 결과가 20입니다")
//            }
//            if (firstStr == "10"){
//                binding.output.append("첫번째 값이 10입니다" )
//            }
//
//            val input1: Any = "안녕"
//            val input2: Any = 10
//
//            if(input1 is String){   //input1이 String이면 (is는 자료형을 확인함) as로 String으로 바꿔서
//                //String 타입인 output2에 넣음
//                val output2: String = input1 as String
//                binding.output.text = "input1은 문자열 자료형입니다"
//            }
//
//
//            val output3:String? = binding.input1 as String?







        }

    }
}