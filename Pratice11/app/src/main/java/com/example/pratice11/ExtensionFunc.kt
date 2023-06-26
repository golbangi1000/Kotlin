package com.example.pratice11

fun main(){



    //확장함수 extension function
    //기존에 정의되어 있는 클래스에 함수를 추가하는 기능

    Test().bye()
    Test().hi()

}

fun Test.hi() = print("하이")

class Test(){
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}
