package com.dovhal.android_labs.android.lab5.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.dovhal.android_labs.android.lab5.database.enities.User
import java.util.UUID

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User

    @Query("SELECT * FROM user WHERE userId==:userId")
    fun findUserById(userId : String) : User

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)
}
