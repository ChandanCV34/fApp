package com.example.food_ordering_app

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
    data class User(@PrimaryKey var uid:Long?=null, var email:String="",
                  var password: String ="",)

