package com.example.administradordetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradordetareas.ui.theme.AdministradorDeTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AdministradorDeTareasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    TasksScheduler()
                }
            }
        }
    }
}

@Composable
fun TasksScheduler(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)

    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.all_completed),
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(0.dp, 24.dp, 0.dp, 8.dp)
        )
        Text(
            text = stringResource(R.string.nice_w),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdministradorDeTareasTheme {
        TasksScheduler()
    }
}