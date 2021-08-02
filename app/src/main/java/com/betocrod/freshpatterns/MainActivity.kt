package com.betocrod.freshpatterns

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.betocrod.freshpatterns.behavioural.home.BEHAVIOURAL_HOME_SCREEN
import com.betocrod.freshpatterns.behavioural.home.BehaviouralHomeScreen
import com.betocrod.freshpatterns.concurrency.home.CONCURRENCY_HOME_SCREEN
import com.betocrod.freshpatterns.concurrency.home.ConcurrencyHomeScreen
import com.betocrod.freshpatterns.creational.home.CREATIONAL_HOME_SCREEN
import com.betocrod.freshpatterns.creational.home.CreationalHomeScreen
import com.betocrod.freshpatterns.home.HOME_SCREEN
import com.betocrod.freshpatterns.home.HomeScreen
import com.betocrod.freshpatterns.structural.home.STRUCTURAL_HOME_SCREEN
import com.betocrod.freshpatterns.structural.home.StructuralHomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "HOME_SCREEN"
            ) {
                composable(HOME_SCREEN) {
                    HomeScreen(
                        onCreationalButtonClicked = { navController.navigate(CREATIONAL_HOME_SCREEN) },
                        onStructuralButtonClicked = { navController.navigate(STRUCTURAL_HOME_SCREEN) },
                        onBehaviouralButtonClicked = { navController.navigate(BEHAVIOURAL_HOME_SCREEN) },
                        onConcurrencyButtonClicked = { navController.navigate(CONCURRENCY_HOME_SCREEN) }
                    )
                }
                composable(CREATIONAL_HOME_SCREEN) { CreationalHomeScreen() }
                composable(STRUCTURAL_HOME_SCREEN) { StructuralHomeScreen() }
                composable(BEHAVIOURAL_HOME_SCREEN) { BehaviouralHomeScreen() }
                composable(CONCURRENCY_HOME_SCREEN) { ConcurrencyHomeScreen() }
            }
        }
    }
}