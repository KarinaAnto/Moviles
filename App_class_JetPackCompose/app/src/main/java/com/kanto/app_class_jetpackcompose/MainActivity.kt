package com.kanto.app_class_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kanto.app_class_jetpackcompose.ui.theme.App_class_JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalData("mi pc")
        }
    }
}

@Composable
private fun PersonalData(name: String) {
   MaterialTheme() {
       Column() {
           Text(text = "Saludos desde $name")
           Text(text = "uwu", style = MaterialTheme.typography.h2)
       }
   }
}
@Preview
@Composable
fun PrevierPersonalData() {
    PersonalData(name="mas allá")
}