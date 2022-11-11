package com.qxy.belajarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.qxy.belajarcompose.ui.theme.BelajarComposeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting()
                        ImageSlide()
                        ImageSlide()
                        ImageSlide()
                    }
                }
            }
        }
    }
}

@Composable
fun ImageSlide() {
    Box(
        modifier = Modifier.padding(top = 8.dp)
    ) {
        Image(
            painterResource(id = R.drawable.coffee),
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Column(
            modifier = Modifier.padding(top = 20.dp, start = 15.dp)
        ) {
            Text(text = "Share Happiness", fontSize = 20.sp)
            Text(text = "Buy One Get 1", fontSize = 16.sp)
        }
    }
}

@Composable
fun Greeting() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(
                text = "Good Morning",
                fontSize = 30.sp
            )
            Text(text = "Fikri")
        }
        Icon(Icons.Default.Email, contentDescription = "")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BelajarComposeTheme {
        Greeting()
    }
}

@Preview(showBackground = true)
@Composable
fun ImageSlidePreview() {
    ImageSlide()
}