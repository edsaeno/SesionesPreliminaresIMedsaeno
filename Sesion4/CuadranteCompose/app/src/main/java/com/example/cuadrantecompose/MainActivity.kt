package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    ComposeBoxInfo()
                }
            }
        }
    }
}

@Composable
fun ComposeBoxInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Column (
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.top_left))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.title1),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.content1),
                    textAlign = TextAlign.Justify,
                )

            }
            Column (
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.top_right))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.title2),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.content2),
                    textAlign = TextAlign.Justify,
                )
            }
        }
        Row(
            modifier = modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            Column (
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.bottom_left))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.title3),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.content3),
                    textAlign = TextAlign.Justify,
                )
            }
            Column (
                modifier = modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(color = colorResource(R.color.bottom_right))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(R.string.title4),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .padding(0.dp, 0.dp, 0.dp, 16.dp)
                )
                Text(
                    text = stringResource(R.string.content4),
                    textAlign = TextAlign.Justify,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        ComposeBoxInfo()
    }
}