package com.example.kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var variable = "홍길동"


        var variable2: String

        variable2 = "안녕하세요"

        //실수형

        var doubleValue: Double = 35.5
        var floatValue:Float = 123.24f

        //정수형
        var intValue: Int = 123
        var longValue: Long = 2_147_483_647   //숫자 사이에 읽기편하게 언더바를 쓸수있음
        var shortValue: Short = 1234
        var byteValue: Byte = 127
        //문자형
        var charchar:Char
        var stiringValue: String
        var a : Boolean = true
        var b : Boolean = true
        var ab = a || b

        var month = 7
        when(month){
            in 1..5 ->{
                Log.d("when", "9월입니다")
            }
            6,7,9 -> {
                Log.d("when", "9월입니다")
            }

        }


        //배열
        //Int -> IntArray

        var intArr = IntArray(10)

        intArr[0] = 10
        intArr[1] = 20
        intArr[2] = 30
        intArr[3] = 40
        intArr[4] = 50


        Log.d("인덱스","4번 인덱스값 ${intArr[4]}")

        var weekArray: CharArray = CharArray(7)




        //컬렉션

      //컬렉션      Generic(제네릭)
        //리스트 , 뮤터블리스트
        var mutableList = mutableListOf<Int>()


        mutableList.add(5)
        mutableList.add(123)
        mutableList.add(15)
        mutableList.add(14)
        mutableList.add(145)

        Log.d("컬렉션", "3번 인덱스의 값 ${mutableList.get(3)}")

        var mutableMap  = mutableMapOf<String, String >()

        mutableMap.put("변수1", "값1")
        mutableMap.put("변수2", "값2")


        //for

        for(idx in 1..20){
            Log.d("반복문", "index${idx}")
        }

        //kotlin playground에서 친거

        for(idx in 1..20){
            println("반복문 index${idx}")
        }


        for(index in 1..20 step 2){
            println("index${index}")
        }

        for(index in 10 downTo 1){
            println(index)
        }

        var intArray2 = intArrayOf(1,2,3,4,5,6,7,1118,9)

        for(value in intArray2){
            println(value)
        }


    }

    fun functionName(){

    }
    fun functionParam(param1:String, param2:Int){
        println("param1= ${param1}, param2= ${param2}")
    }
    fun getPI(): Double{
        return 3.141592
    }
}