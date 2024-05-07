package com.manhle.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manhle.myapplication.R

@Composable
fun RatingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp)
    ) {
        Scaffold (
            topBar = { RatingBar() }
        ) { innerPadding ->
            Column (
                modifier = Modifier.padding(innerPadding)
            ) {
                RatingContent()
            }
        }
    }
}

@Composable
fun RatingBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    Icons.Filled.KeyboardArrowLeft,
                    contentDescription = "Back"
                )
            }
            Text(text = "4.8 (4,799 reviews)", fontWeight = FontWeight.Bold)
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.MoreVert, contentDescription = "More")
        }
    }
}

@Composable
fun RatingContent() {
    LazyRow(
        modifier = Modifier.padding(start = 16.dp)
    ) {
        items(6) {
            ChooseButton(isChoosing = if (it == 0) true else false )
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(15) {
            RatingComponent()
        }
    }
}

@Composable
fun RatingComponent() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.studentid),
                    contentDescription = "Avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Anh Nguyet",
                    fontWeight = FontWeight.Bold
                )
            }
            Row (
                verticalAlignment = Alignment.CenterVertically
            ) {
                ChooseButton(isChoosing = false)
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    Icons.Filled.MoreVert,
                    contentDescription = "More"
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Ok")
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Icon(
                Icons.Outlined.FavoriteBorder,
                contentDescription = "Favorite"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "370")
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "2 days ago", color = Color.Gray)
        }
    }
}

@Composable
fun ChooseButton(
    isChoosing: Boolean = false,
    content: String = "5"
) {
    OutlinedButton(
        onClick = { /*TODO*/ },
        contentPadding = PaddingValues(0.dp),
        border = BorderStroke(1.dp, Color.Green),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isChoosing) Color.Green else Color.Transparent,
            contentColor = if (isChoosing) Color.White else Color.Green
        )
    ) {
        Icon(painter = painterResource(
            id = R.drawable.baseline_star_rate_24),
            contentDescription = "Rate",
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = content
        )
    }
}

@Preview
@Composable
fun RatingScreenPreview() {
    Surface {
        RatingScreen()
    }
}