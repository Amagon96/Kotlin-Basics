package com.example.railRoadOperations.controllers

import com.example.railRoadOperations.models.ClassificationTrack
import com.example.railRoadOperations.models.Train
import com.example.railRoadOperations.services.TrainServiceImpl
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import jakarta.inject.Inject

@Controller("/trains")
class TrainController {

    @Inject
    lateinit var trainServiceImpl: TrainServiceImpl

    @Post("/railroadoperations")
    fun getTrains(@Body trains: List<Train>): List<ClassificationTrack> {
        val response = trainServiceImpl.orderTrains(trains)
        return response
    }
}