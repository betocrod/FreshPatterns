package com.betocrod.freshpatterns.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.betocrod.freshpatterns.ui.theme.MyApplicationTheme

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { HomeAppBar() }
    ) {
        val modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(1.dp)
        HomeContent(modifier)
    }
}

@Composable
private fun HomeAppBar() {
    TopAppBar(title = { Text(text = "FreshPatterns") })
}

@Composable
private fun HomeContent(modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(modifier = Modifier.weight(0.5f)) {
            HomeButton("Creational", modifier.weight(0.5f))
            VerticalDivider()
            HomeButton("Structural", modifier.weight(0.5f))
        }
        Divider()
        Row(modifier = Modifier.weight(0.5f)) {
            HomeButton("Behavioural", modifier.weight(0.5f))
            VerticalDivider()
            HomeButton("Concurrency", modifier.weight(0.5f))
        }
    }
}

@Composable
private fun VerticalDivider() {
    Divider(
        modifier = Modifier
            .fillMaxHeight()
            .width(1.dp)
    )
}

@Composable
private fun HomeButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = modifier
    ) {
        Text(text = text)
    }
}

@Preview("HomeScreenPreview", showBackground = true)
@Composable
fun HomeScreenPreview() {
    MyApplicationTheme {
        HomeScreen()
    }
}