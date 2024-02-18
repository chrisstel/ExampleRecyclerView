package com.example.examplerecyclerview.model

object UserProvider {
    val userList = (1..80).map {
        User(name = "Aaaaa", surname = "Bbbb")
    }.toList()
}