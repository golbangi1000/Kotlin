package com.example.pratice11

fun main(){
    println(check("안녕"))
    println(check(1))
    println(check(false))


    cast("안녕")
    cast(1)

    println(smartcast("안녕"))
    println( smartcast(10))
    println( smartcast(true))


}


fun check(a : Any): String {
    return when(a){
        is String -> ("문자열")
        is Int -> ("숫자")
        else -> {
            ("몰라요")
        }
    }
}


fun cast(a : Any){
    val result = a as? String
    println(result)
}

fun smartcast(a : Any) : Int{
    //type 체크하고 난후 그 타입꺼를 쓸수있음
    return if( a is String){
        a.length
    } else if(a is Int){
        a.dec()
    } else{
        -1
    }
}

