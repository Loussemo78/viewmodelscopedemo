package com.example.viewmodelscopedemo

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers():List<User>{
        delay(8000)
        val users : List<User> = listOf(
            User(1,"Sam"),
            User(2,"Mas"),
            User(3,"Caro"),
            User(4,"Amy"),
        )
        return users
    }
}