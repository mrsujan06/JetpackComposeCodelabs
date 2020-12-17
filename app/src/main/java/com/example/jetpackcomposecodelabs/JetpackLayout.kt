package com.example.jetpackcomposecodelabs

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AmbientContentAlpha
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposecodelabs.model.PhotoCards


@Composable
fun PhotographerCard(photoCards: PhotoCards, modifier: Modifier = Modifier) {

    Row(
        modifier
            .padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = { /*TODO*/ })
            .padding(16.dp)
            .fillMaxWidth()
    ) {

        UserPhoto(photoCards, modifier)

        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)
        ) {
            //User information
            UserInfo(photoCards)
        }
    }

}


@Composable
fun UserPhoto(photoCards: PhotoCards, modifier: Modifier) {
    Surface(
        modifier = modifier
            .preferredSize(50.dp)
            .border(border = BorderStroke(1.dp, Color.Blue), shape = CircleShape),
        shape = CircleShape,
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.2f)
    ) {
        val image = imageResource(photoCards.image)
        Image(image)
    }
}

@Composable
fun UserInfo(photoCards: PhotoCards) {

    Text(photoCards.name, fontWeight = FontWeight.Bold)
    Providers(AmbientContentAlpha provides ContentAlpha.medium) {
        Text(photoCards.onlineStatus, style = MaterialTheme.typography.body2)
    }
}

@Preview
@Composable
fun PhotographerCardPreview() {
    val photo = PhotoCards("Sasuke ", R.drawable.sasuke, "4 min ago")
    PhotographerCard(photoCards = photo)
}