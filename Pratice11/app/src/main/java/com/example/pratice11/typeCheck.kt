package com.example.pratice11

fun main(){
    println(check("안녕"))
    println(check(1))
    println(check(false))
    println(cast("안녕"))
    println(cast(1))

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

