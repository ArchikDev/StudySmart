package com.example.studysmart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.studysmart.presentation.NavGraphs
import com.example.studysmart.presentation.theme.StudySmartTheme
import com.ramcosta.composedestinations.DestinationsNavHost

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudySmartTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}