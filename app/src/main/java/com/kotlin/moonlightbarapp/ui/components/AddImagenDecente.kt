package com.kotlin.moonlightbarapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import coil.compose.rememberAsyncImagePainter


@Composable
fun AddImageDecente(
    url: String,
    modifier: Modifier = Modifier,
    description: String,
) {
    val painter = rememberAsyncImagePainter(model = url)
    Image(
        painter = painter,
        contentDescription = description,
        modifier = modifier
            .clip(RectangleShape)
            .aspectRatio(1f, true)
    )
}