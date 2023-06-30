package com.example.pratice11

import android.os.Build.VERSION_CODES.N
import com.example.pratice11.Book.Novel.NAME
import java.util.jar.Attributes.Name

fun main(){

    //선언 동시에 객체 생성
    Counter
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.hello()


    NAME

}

object  Counter : Hello(){
    init {
        println("초기화")
    }
    var count = 0
    fun countUp(){
        count++
    }
}

open class Hello(){
    fun hello() = println("hello")
}


class Book{
    companion object Novel{
        const val NAME = "hello"
        fun create() = Book()
    }
}