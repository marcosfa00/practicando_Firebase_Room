package com.marcosfa.firebaseyroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.marcosfa.firebaseyroom.Room.AppDatabase
import com.marcosfa.firebaseyroom.View.SignIn
import com.marcosfa.firebaseyroom.ViewModel.MyViewModel
import com.marcosfa.firebaseyroom.ui.theme.FirebaseYRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseYRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Creamos una base de datos con Builder
                    val database = Room.databaseBuilder(
                        this,
                        AppDatabase::class.java,
                        "roomDatabase"
                    ).build()

                    val housedao = database.houseDAO()
                    val viewModel = MyViewModel(housedao)


                    Greeting(viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(vModel: MyViewModel) {
   SignIn(vModel)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FirebaseYRoomTheme {
     
    }
}