package com.example.pratice11

fun main() {
    val a = 1
    println(a)

    var kid = Kid("bob", 12, "남")

}
    open class User(open val name : String ,open var age : Int = 1)


    class Kid(override val name: String, override var age: Int) : User(name, age) {

        init {
            println("이거 먼저  ")
        }


        var gender : String = "female"
        constructor(name: String, age : Int, gender : String) : this(name,age){
            this.gender = gender
                println("부생성자")

        }
    }

