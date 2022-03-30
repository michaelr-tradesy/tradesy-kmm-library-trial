package com.example.tradesykmmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.ComposeView
import com.example.tradesykmmapp.ui.theme.ColorPalette
import com.example.tradesykmmapp.ui.theme.Tradesy_KMM_RDTheme
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController

interface AppActivity

abstract class DefaultAppActivity :  ComponentActivity(), AppActivity {

    private lateinit var systemUiController: SystemUiController
    private lateinit var appThemeState: MutableState<AppThemeState>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ComposeView(this).also {
            setContentView(it)
        }.setContent {
            PostSetContent(savedInstanceState)
        }
    }

    @Composable
    private fun PostSetContent(savedInstanceState: Bundle?) {
        val isDarkMode = isSystemInDarkTheme()
        val systemUiController = rememberSystemUiController()
        appThemeState =
            remember {
                mutableStateOf(
                    DefaultAppThemeState(
                        isDarkTheme = isDarkMode,
                        colorPalette = ColorPalette.Pebble
                    )
                )
            }
        Tradesy_KMM_RDTheme(
            systemUiController = systemUiController,
            appThemeState = appThemeState.value,
        ) {
            MyApp(savedInstanceState)
        }
    }

    @Composable
    abstract fun MyApp(savedInstanceState: Bundle?)
}