package ru.urinoff.notesapppochta.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.urinoff.notesapppochta.screens.Add
import ru.urinoff.notesapppochta.screens.Main
import ru.urinoff.notesapppochta.screens.Note
import ru.urinoff.notesapppochta.screens.Start

sealed class NavRoute(val route: String) {
    object Start:NavRoute(route = "start_screen")
    object Main:NavRoute(route = "main_screen")
    object Add:NavRoute(route = "add_screen")
    object Note:NavRoute(route = "note_screen")
}

@Composable
fun NotesNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Start.route){
        composable(NavRoute.Start.route){ Start(navController = navController) }
        composable(NavRoute.Main.route){ Main(navController = navController) }
        composable(NavRoute.Add.route){ Add(navController = navController) }
        composable(NavRoute.Note.route){ Note(navController = navController) }
    }
}