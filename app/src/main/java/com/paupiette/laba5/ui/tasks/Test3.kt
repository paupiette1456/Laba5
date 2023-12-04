package com.paupiette.laba5.ui.tasks

import android.content.pm.ActivityInfo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Orientation() {
    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    val orientationText = if (isPortrait) {
        "Портретная ориентация"
    } else {
        "Альбомная ориентация"
    }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = orientationText)
    }
}

@Preview
@Composable
fun PreviewOrientation() {
    Orientation()
}
