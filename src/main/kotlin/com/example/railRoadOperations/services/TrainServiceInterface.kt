package com.example.railRoadOperations.services

import com.example.railRoadOperations.models.ClassificationTrack
import com.example.railRoadOperations.models.Train

interface TrainServiceInterface {
    fun orderTrains(trains: List<Train>): List<ClassificationTrack>
}