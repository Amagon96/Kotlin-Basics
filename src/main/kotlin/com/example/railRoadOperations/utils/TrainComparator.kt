package com.example.railRoadOperations.utils

import com.example.railRoadOperations.models.Train
import jakarta.inject.Singleton

@Singleton
class TrainComparator {

    private val destinations: HashMap<String, Int> = hashMapOf(
        "Houston" to 0,
        "Chicago" to 1,
        "LA" to 2
    )

    private val receivers: HashMap<String, Int> = hashMapOf(
        "UPS" to 0,
        "FedEx" to 1,
        "Old Dominion" to 2
    )

    fun sortTrains(trains: ArrayList<Train>): ArrayList<Train> {
        val destinationComparator = Comparator { o1: Train, o2: Train ->

            if (!destinations.containsKey(o1.destination) || !receivers.containsKey(o1.receiver)){
                return@Comparator 1
            } else if (!destinations.containsKey(o2.destination) || !receivers.containsKey(o2.receiver)){
                return@Comparator -1
            }

            if (o1.destination == o2.destination)
                return@Comparator receivers[o1.receiver]!! - receivers[o2.receiver]!!
            else
                return@Comparator destinations[o1.destination]!! - destinations[o2.destination]!!
        }

        val copy = arrayListOf<Train>().apply { addAll(trains) }
        copy.sortWith(destinationComparator)
        return copy
    }
}