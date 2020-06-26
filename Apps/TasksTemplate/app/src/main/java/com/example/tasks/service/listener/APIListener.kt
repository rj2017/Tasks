package com.example.tasks.service.listener

import com.example.tasks.service.model.TaskModel

interface APIListener<T> {

    fun onSucess(model: T)
    fun onFailure(str: String)
}