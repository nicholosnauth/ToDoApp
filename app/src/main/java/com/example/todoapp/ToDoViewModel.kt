package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToDoViewModel : ViewModel(){

    private var _todoList = MutableLiveData<List<ToDo>>()
    val todoList : LiveData<List<ToDo>> = _todoList

    fun geAllToDo() {
        _todoList.value = ToDoManager.getAllToDo().reversed()
    }

    fun addToDo(title : String){
            ToDoManager.addToDo(title)
             geAllToDo()
    }
    fun deleteToDo(id : Long){
        ToDoManager.deleteToDo(id)
        geAllToDo()

    }
}