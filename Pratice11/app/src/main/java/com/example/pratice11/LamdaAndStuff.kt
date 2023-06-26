package com.example.pratice11

fun main(){


            //1. 익명함수

    val a = fun(){
        println("hello")
    }
    val c : Int = 10
    val b : (Int) -> Int = {
        it * 10
    }
    val e = {i : Int, j : Int -> i*j}

    val f : (Int, String, Boolean) -> String = { _,b,_ -> b }

    println(e(21,2))
    println(b(10))
//    println(useMethod(1,b ))
    useMethod(1,b)


    var q : (Int) -> Int = useMethod(2,b)

    println(q(1))


}


                        //이런 타입 input
fun useMethod(a : Int, b:  (Int) -> Int) : (Int) -> Int{
    println(a)
    println(b(20))
                            return b
}



