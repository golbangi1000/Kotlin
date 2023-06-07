package com.example.pratice11

fun main() {
    max(10, 3)
    isHoliday("금")
    isHoliday("토")
    isHoliday("일")

}


fun max(a: Int, b: Int) {
    val result = if (a > b) {
        a
    } else {
        b
    }
    println(result)
}

fun max2(a: Int, b: Int) {
    val result = if (a > b) a else b
    println(result)
}

//월 화 수 목 금 토 일
fun isHoliday(days: String) {
    val result = when (val day = days) {
        "토","일" -> {
            if(day == "토"){
                "좋아"
            } else{
                "아직 ㄱㅊ"
            }
        }
        else -> false
    }
    println(result)
}