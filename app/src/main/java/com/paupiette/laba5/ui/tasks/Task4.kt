package com.paupiette.laba5.ui.tasks

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LocalCustomData = compositionLocalOf<String> { error("No CustomData provided") }

@Composable
fun Widget(content: @Composable (String) -> Unit) {
    CompositionLocalProvider(LocalCustomData provides "Это данные из Composable") {
        content(LocalCustomData.current)
    }
}

@Composable
fun MyWidget(data: String) {
    Column(
        modifier = Modifier
            .padding(16.dp)) {
        Text(text = "Это виджет с данными: $data")
    }
}


@Composable
fun Laba4() {
    Box(
        modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
        {
                Widget { data ->
                    MyWidget(data)
                }
        }
}

@Preview
@Composable
fun PreviewLaba4() {
    Laba4()
}
