package com.example.animatedsplashscreen_jc



sealed class Screen (var route : String){
    object SplashScreen : Screen("splash_screen")
    object MainScreen : Screen("main_screen")
}