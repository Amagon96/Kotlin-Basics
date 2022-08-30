package com.example

import com.example.constructors.Duck
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/hello")
class GreetingRoutes {

    var duck = Duck("Howard")

    @Get("/duck")
    fun salute(): String{
        return duck.greeting()
    }
}