package com.paupiette.laba5.ui.tasks

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MySnackbar() {
    var snackbarVisible by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Пример Snackbar") }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { snackbarVisible = true }) {
                    Text("Показать Snackbar")
                }

                if (snackbarVisible) {
                    Snackbar(
                        modifier = Modifier
                            .padding(top = 8.dp),
                        action = {
                            TextButton(
                                onClick = { snackbarVisible = false }) {
                                Text("Закрыть")
                            }
                        },
                    ) {
                        Text("Это Snackbar")
                    }
                }
            }
        }
    )
}

@Preview
@Composable
fun PreviewMySnackbar() {
    MySnackbar()
}
