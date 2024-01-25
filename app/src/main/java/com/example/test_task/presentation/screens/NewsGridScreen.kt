package com.example.test_task.presentation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_task.data.model.News

@Composable
fun NewsGridScreen(
    modifier: Modifier,
    onNewClicked: (News) -> Unit,
    news: List<News>,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(1),
        contentPadding = PaddingValues(4.dp)
    ) {
        itemsIndexed(news) { _, news ->
            NewsCard(news = news, modifier = modifier, onNewClicked = onNewClicked)
        }
    }
}

@Composable
fun NewsCard(
    news: News,
    modifier: Modifier,
    onNewClicked: (News) -> Unit
) {
    Card(
        modifier = modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable { onNewClicked(news) },
        shape = RoundedCornerShape(10.dp),
        elevation = 8.dp
    ) {
        Column(
            verticalArrangement = Arrangement.Top
        ) {
            news.title?.let { title ->
                Text(
                    text = title,
                    fontSize = 16.sp,
                    modifier = modifier
                        .padding(
                            start = 8.dp,
                            top = 4.dp,
                            end = 8.dp,
                            bottom = 4.dp,
                        ),
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.Bold,
                    overflow = TextOverflow.Ellipsis,
                    softWrap = false
                )
            }

            Row {
                news.time?.let { time ->
                    news.convertLongToTime(time).let {
                        Text(
                            text = it,
                            color = Color.Gray,
                            textAlign = TextAlign.Center,
                            fontSize = 14.sp,
                            modifier = modifier
                                .padding(
                                    start = 8.dp,
                                    top = 4.dp,
                                    end = 8.dp,
                                    bottom = 4.dp,
                                ),
                            fontFamily = FontFamily.Serif,
                        )

                        news.tags?.let { tags ->
                            LazyRow {
                                itemsIndexed(tags.toList()) { _, it ->
                                    Card(
                                        modifier = modifier
                                            .padding(start = 4.dp, bottom = 4.dp),
                                        elevation = 8.dp
                                    ) {
                                        Text(
                                            text = it,
                                            color = Color.Gray,
                                            textAlign = TextAlign.Center,
                                            fontSize = 14.sp,
                                            modifier = modifier
                                                .padding(
                                                    start = 8.dp,
                                                    top = 4.dp,
                                                    end = 8.dp,
                                                    bottom = 4.dp,
                                                ),
                                            fontFamily = FontFamily.Serif,
                                            fontWeight = FontWeight.Light,
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}