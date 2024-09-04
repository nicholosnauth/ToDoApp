package com.example.todoapp

import java.time.Instant
import java.util.Date

data class ToDo(
    var id: Long,
    var title: String,
    var createdAt : Date
)

fun getFakeToDo() : List<ToDo>{
    return listOf<ToDo>(


    )

}