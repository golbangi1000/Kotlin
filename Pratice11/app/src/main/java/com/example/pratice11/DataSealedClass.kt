package com.example.pratice11

fun main(){

    val person  = Human("수지", 24, )
    val dog = Dog("해피", 14)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat : Cat = BlueCat()
    val result = when(cat){   //sealed class를 쓰면 else가 필요없어짐
        is BlueCat -> {"blue"}
        is RedCat -> {"red"}
        is GreenCat -> {"green"}
        is WhiteCat -> {"white"}   //클래스를 빼먹으면 에러가 뜸
    }

    println(result)
}

class Human(val name : String, val age : Int )


// data클래스는 상속 불가
data class Dog(
    val name : String,
    val age : Int,
)

// sealed class
sealed class Cat
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()

class WhiteCat : Cat()
