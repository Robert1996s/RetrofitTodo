package com.example.retrofittodo

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface TodoApi {

    //Not the base URL in get req
    @GET("/todos")

    suspend fun getTodos(): Response<List<Todo>>


    //@POST("/createTodo")
    //fun createTodo(@Body todo: Todo): Response<ClassCreateTodo>
}