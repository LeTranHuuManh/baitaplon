package com.manhle.myapplication.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manhle.myapplication.R


@Composable
fun FoodItem() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
    {

        Column(Modifier.fillMaxWidth())
        {
            Row(
                modifier = Modifier.fillMaxWidth()
                    .height(50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = "",
//                    modifier = Modifier.clickable {
//                        onBackClick()
//                    }
                )

                Spacer(modifier = Modifier.width(5.dp))

                Text(
                    text = "Pizza",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(30.dp))
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .height(130.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fast_food),
                    contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .size(200.dp)
                )
                Column(
                    modifier = Modifier
                        .weight(2f),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Classic Pepperoni Pizza",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "500m",
                            fontSize = 16.sp
                        )

                        Text(
                            text = "|",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )

                        Icon(
                            painter = painterResource(id = R.drawable.star_rate),
                            contentDescription = "Rate",
                            modifier = Modifier.size(16.dp),
                            tint = Color.Yellow
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "4.5 (1.2k)",
                            fontSize = 16.sp
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$10.00",
                            fontSize = 16.sp
                        )

                        Text(
                            text = "|",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )

                        Text(
                            text = "$1.5",
                            fontSize = 16.sp,
                            modifier = Modifier.weight(1f)
                        )

                        Icon(
                            Icons.Outlined.FavoriteBorder,
                            contentDescription = "Favorite",
                            modifier = Modifier.padding(end = 8.dp) // Đặt khoảng cách giữa Icon và lề cuối cùng của Row
                        )
                    }

                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .height(130.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fast_food),
                    contentDescription = "",
                    modifier = Modifier
                        .weight(1f)
                        .size(200.dp)
                )
                Column(
                    modifier = Modifier
                        .weight(2f),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Classic Pepperoni Pizza",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "500m",
                            fontSize = 16.sp
                        )

                        Text(
                            text = "|",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )

                        Icon(
                            painter = painterResource(id = R.drawable.star_rate),
                            contentDescription = "Rate",
                            modifier = Modifier.size(16.dp),
                            tint = Color.Yellow
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "4.5 (1.2k)",
                            fontSize = 16.sp
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.End,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$10.00",
                            fontSize = 16.sp
                        )

                        Text(
                            text = "|",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        )

                        Text(
                            text = "$1.5",
                            fontSize = 16.sp,
                            modifier = Modifier.weight(1f)
                        )

                        Icon(
                            Icons.Outlined.FavoriteBorder,
                            contentDescription = "Favorite",
                            modifier = Modifier.padding(end = 8.dp) // Đặt khoảng cách giữa Icon và lề cuối cùng của Row
                        )
                    }

                }
            }

        }
    }
}

@Preview
@Composable
fun FoodItemPreview() {
    FoodItem()
}