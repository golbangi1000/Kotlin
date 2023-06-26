package com.example.pratice11




 lateinit var  text : String
 // primitive 타입은 안됨
 lateinit var age : Integer

 val test : Int by lazy{
     println("초기화중")
     100

 }

fun main(){
    println("메인 함수 실행")
    println("초기화한 값 $test")
    println("두번째 호출 $test")



}