package com.example.hw1_4m

import java.io.Serializable

data class User(
    val name: String = " ",
    val gmail: String = " ", val password: Int
) : Serializable