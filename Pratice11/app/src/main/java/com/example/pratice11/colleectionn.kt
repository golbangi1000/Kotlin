package com.example.pratice11

fun main(){

    val list = mutableListOf(1,2,3,4,5,)
    list.add(5)
    list.addAll(listOf(7,8,9))

    val list1 = listOf(1,2,3,4)  //immutable
    list[0]
    println(list)
    println(list.joinToString(","))

    val diverseList = listOf(1,"ㄴㅇ",2,"3223",0.1)

    var list2 = list.map { it * 10 }
    println(list2)
    println(list2.joinToString(", "))

    val map1 = mapOf((1 to "안녕"), (2 to "hello"))
    val map2 = mutableMapOf((1 to "안녕"), (2 to "hello"))

    map2.put(3, "응")


    map2[100] = "호이"
    println(map2)






}