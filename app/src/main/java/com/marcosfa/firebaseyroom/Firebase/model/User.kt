package com.marcosfa.firebaseyroom.Firebase.model

data class User (
    val name:String,
    val age:String,
    val gmail:String,
    val connected:Boolean

){
    //Here we declare the empty constriuctor
    constructor():this("","","@gmail.com",false)
}