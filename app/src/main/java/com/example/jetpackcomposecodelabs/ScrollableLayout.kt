package com.example.jetpackcomposecodelabs.ui

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposecodelabs.PhotographerCard
import com.example.jetpackcomposecodelabs.R
import com.example.jetpackcomposecodelabs.model.PhotoCards


val photoCardList = listOf(
    PhotoCards("Gara", R.drawable.gara, "5 min ago"),
    PhotoCards("Hinata", R.drawable.hinata, "10 min ago"),
    PhotoCards("Itachi", R.drawable.itachi, "8 min ago"),
    PhotoCards("Kakashi", R.drawable.profilepic, "2 min ago"),
    PhotoCards("Sasuke", R.drawable.sasuke, "5 min ago"),
    PhotoCards("Lee", R.drawable.lee, "4 min ago"),
    PhotoCards("Shikaku", R.drawable.shikaku, "1 min ago"),
    PhotoCards("Gara", R.drawable.gara, "5 min ago"),
    PhotoCards("Hinata", R.drawable.hinata, "10 min ago"),
    PhotoCards("Itachi", R.drawable.itachi, "8 min ago"),
    PhotoCards("Kakashi", R.drawable.profilepic, "2 min ago"),
    PhotoCards("Sasuke", R.drawable.sasuke, "5 min ago"),
    PhotoCards("Lee", R.drawable.lee, "4 min ago"),
    PhotoCards("Shikaku", R.drawable.shikaku, "1 min ago")
)

@Composable
fun Feed(
    feedItems: List<PhotoCards>
) {
    ScrollableColumn(Modifier.fillMaxSize()
    , horizontalAlignment = Alignment.CenterHorizontally) {
        feedItems.forEach {
            PhotographerCard(it)
        }
    }
}

@Preview
@Composable
fun FeedPreview() {
    Feed(feedItems = photoCardList)
}