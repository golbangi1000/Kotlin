package com.example.pratice11

fun main(){



    var name : String = "동욱"
    var number : Int  = 10

    var nickname : String? = null
    var secondNumber : Int? = null

    val result =  nickname?: "값이 없음"

    val size  = nickname?.length
    println(size)

}