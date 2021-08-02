package com.betocrod.freshpatterns.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.betocrod.freshpatterns.ui.theme.MyApplicationTheme

const val HOME_SCREEN = "HOME_SCREEN"

@Composable
fun HomeScreen(
    onCreationalButtonClicked: () -> Unit,
    onStructuralButtonClicked: () -> Unit,
    onBehaviouralButtonClicked: () -> Unit,
    onConcurrencyButtonClicked: () -> Unit) {
    Scaffold(
        topBar = { HomeAppBar() }
    ) {
        val modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(1.dp)
        HomeContent(
            onCreationalButtonClicked,
            onStructuralButtonClicked,
            onBehaviouralButtonClicked,
            onConcurrencyButtonClicked,
            modifier
        )
    }
}

@Composable
private fun HomeAppBar() {
    TopAppBar(title = { Text(text = "FreshPatterns") })
}

@Composable
private fun HomeContent(
    onCreationalButtonClicked: () -> Unit,
    onStructuralButtonClicked: () -> Unit,
    onBehaviouralButtonClicked: () -> Unit,
    onConcurrencyButtonClicked: () -> Unit,
    modifier: Modifier = Modifier) {
    Column(modifier) {
        Row(modifier = Modifier.weight(0.5f)) {
            HomeButton(
                homeOption = HomeOption.CreationalHomeScreen,
                onClickListener = { onCreationalButtonClicked() },
                modifier = modifier.weight(0.5f)
            )
            VerticalDivider()
            HomeButton(
                homeOption = HomeOption.StructuralHomeScreen,
                onClickListener = { onStructuralButtonClicked() },
                modifier = modifier.weight(0.5f)
            )
        }
        Divider()
        Row(modifier = Modifier.weight(0.5f)) {
            HomeButton(
                homeOption = HomeOption.BehaviouralHomeScreen,
                onClickListener = { onBehaviouralButtonClicked() },
                modifier = modifier.weight(0.5f)
            )
            VerticalDivider()
            HomeButton(
                homeOption = HomeOption.ConcurrencyHomeScreen,
                onClickListener = { onConcurrencyButtonClicked() },
                modifier = modifier.weight(0.5f)
            )
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
    homeOption: HomeOption,
    onClickListener: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { onClickListener() },
        modifier = modifier
    ) {
        Text(text = homeOption.title)
    }
}

@Preview("HomeScreenPreview", showBackground = true)
@Composable
fun HomeScreenPreview() {
    MyApplicationTheme {
            // TODO
    }
}