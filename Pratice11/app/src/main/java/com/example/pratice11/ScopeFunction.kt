package com.example.pratice11

fun  main(){

    //   let, run,  apply, also, with
    // 1.let
    var a = 3
    a.let {  }
    val user : Person? = Person("채상아", 21, true)


    // 수신객체.let{ it  -> 바꾸고 싶으면 user -> 이런식
    //
    // 마지막 줄  // return 값
    // }
   val age =  user?.let {
       it.age
   }
    println(age)


   //2. run
   //수신객체.run { this -
    //
    // 마지막줄
    //  }
    //


    val kid  = Person("아이" , 12 , false)
    val kidAge = kid.run {
        //run에서는 그냥 접근 가능
        age
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply{
    // adsfasdfadsf
    //
    //}
    // return 값이 수신객체
    //
    val kidName = kid.apply {
        name
    }
    val female  = Person("슬기", 20, true, true)
    var    femaleValue = female.apply {
            hasGlasses = false
    }
    println(femaleValue.hasGlasses)


    //4. also { it -> //local variable
    //
    //
    //  }  // return  수신객체 (자기자신)
    //
    val male = Person("철수", 23, false, true)
    val maleValue = male.also {
            //로그를 찍고 싶을떄 also를 많이 씀
        println(it.name)
    }

    println(maleValue)


    //5. with
    // with(수신객체) {
    //
    // 마지막줄 리턴

    val result = with(male){

        hasGlasses = false
        true
    }







}


class Person(val name : String, val age : Int, val gender : Boolean, var hasGlasses : Boolean = true)