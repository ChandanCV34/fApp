package com.example.food_ordering_app

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDAO {
    @Query("SELECT * FROM users WHERE email=:email AND password=:password")
    suspend fun findByUserEmailPassword(email:String, password:String):User?
    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun insert(user: User)
    @Query("DELETE FROM users WHERE email=:email")
    suspend fun deleteuserAccount(email: String)
    @Query("UPDATE USERS Set email=:email")
    suspend fun updateuserAccount(email: String)
}