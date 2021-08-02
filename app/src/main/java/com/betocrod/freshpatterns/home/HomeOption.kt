package com.betocrod.freshpatterns.home

sealed class HomeOption(val title: String) {

    object CreationalHomeScreen: HomeOption("Creational")
    object StructuralHomeScreen: HomeOption("Structural")
    object BehaviouralHomeScreen: HomeOption("Behavioural")
    object ConcurrencyHomeScreen: HomeOption("Concurrency")
}