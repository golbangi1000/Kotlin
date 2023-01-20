package com.example.function2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.function2.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
//            val result = add(a=10,b=10)

            //이게 람다식
            val addFunc = { a:Int, b:Int-> a + b}
            val result = calc(10,12,addFunc)


            val addfunction2 = getOperator("add")
            val result2 = calc(20, 20, addfunction2!!)  // !!을 써서 null을 unwrap

            binding.output1.text = "결과: $result"
        }


    }

    //리턴값이 함수
    fun getOperator(name:String):((Int,Int)->Int)?{   //oper이 물음표가 불어있으니깐 리턴값도 ?를 붙힘
        var oper:((Int,Int)->Int)? = null //물음표를 붙혀서 null이 들어갈수있게함
        if(name == "add"){
            oper =  {a:Int, b:Int -> a + b}
        } else if(name == "subtract"){
            oper =  {a:Int, b:Int -> a - b}
        }
        return oper
    }


    //함수가 전달되게 하기
    // (Int,Int)인 함수가 Int를 리턴
    // 안에 내용은 first second를 oper:(Int,Int)안에 넣어서 결과값을 리턴
    fun calc(first:Int, second:Int, oper:(Int,Int)-> Int):Int{
        return oper(first, second)
    }
    fun add(a:Int, b:Int):Int{
        return a + b
    }


}