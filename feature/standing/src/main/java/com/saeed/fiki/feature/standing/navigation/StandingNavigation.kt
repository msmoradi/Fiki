package com.saeed.fiki.feature.standing.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.saeed.fiki.feature.standing.StandingScreen

const val standingNavigationRoute = "standing_route"

fun NavController.navigateToStanding(navOptions: NavOptions? = null) {
    this.navigate(standingNavigationRoute, navOptions)
}

fun NavGraphBuilder.standingScreen() {
    composable(route = standingNavigationRoute) {
        StandingScreen()
    }
}