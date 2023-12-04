package com.paupiette.laba5.ui.tasks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun DelayedStringContent() {
    var delayedString by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) {
        delay(3000)
        delayedString = "Flutter хуета :)"
    }
    Box(
        modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)) {
        Column {
            if (delayedString != null) {
                Surface(
                    modifier = Modifier
                        .padding(16.dp),
                    shape = MaterialTheme.shapes.medium
                ) {
                    Text(
                        text = delayedString!!)
                }
            } else {
                CircularProgressIndicator(
                    modifier = Modifier
                        .padding(16.dp))
            }
        }
    }

}

@Preview
@Composable
fun PreviewDelayedStringContent() {
    MaterialTheme {
        DelayedStringContent()
    }
}