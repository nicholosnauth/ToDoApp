package com.example.todoapp

import java.util.Date

object ToDoManager {

    private val ToDoList = mutableListOf<ToDo>()

    fun getAllToDo() : List<ToDo>{
            return ToDoList
    }

    fun addToDo(title : String){
        ToDoList.add(ToDo(
            id = System.currentTimeMillis(),
            title = title,
            createdAt = Date()))



    }
    fun deleteToDo(id : Long){
        ToDoList.removeIf{
            it.id==id
            }
    }
}