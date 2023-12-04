package com.paupiette.laba5.ui.tasks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun generateData(): Flow<String> = flow {
    repeat(10) {
        delay(1000)
        emit("Сисечки $it")
    }
}

@Composable
fun DataDisplay() {
    var data by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        val generatedData = generateData()
        generatedData.collect { newData ->
            data = newData
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)) {


            Text(
                text = data)

    }

}

@Preview
@Composable
fun PreviewDataDisplay() {
    MaterialTheme {
        DataDisplay()
    }
}
