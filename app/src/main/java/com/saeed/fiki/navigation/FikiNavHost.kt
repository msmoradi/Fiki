package com.saeed.fiki.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.saeed.fiki.feature.standing.navigation.standingNavigationRoute
import com.saeed.fiki.feature.standing.navigation.standingScreen

@Composable
fun FikiNavHost(
    navController: NavHostController,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    startDestination: String = standingNavigationRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        standingScreen()
    }
}
