package com.example.pratice11

fun main(){

    val person  = Human("수지", 24, )
    val dog = Dog("해피", 14)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString())

    val cat : Cat = BlueCat()
}

class Human(val name : String, val age : Int )


// data클래스는 상속 불가
data class Dog(
    val name : String,
    val age : Int,
)

// sealed class
abstract class Cat
class BlueCat : Cat()
class RedCat : Cat()