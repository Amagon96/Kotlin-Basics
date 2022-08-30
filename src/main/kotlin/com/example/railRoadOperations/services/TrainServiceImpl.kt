package com.example.railRoadOperations.services

import com.example.railRoadOperations.models.ClassificationTrack
import com.example.railRoadOperations.models.Train
import jakarta.inject.Singleton

@Singleton
class TrainServiceImpl: TrainServiceInterface {

    override fun orderTrains(trains: List<Train>): List<ClassificationTrack> {
        return trains.sortedBy { t -> t.destination }
    }

}