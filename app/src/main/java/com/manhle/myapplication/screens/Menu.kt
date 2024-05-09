package com.manhle.myapplication.screens

import android.text.style.BackgroundColorSpan
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.orderfoodapp.ui.theme.colorGreenlight
import com.manhle.myapplication.R

@Composable
fun Menu() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.avatar), contentDescription = "null",
                    modifier = Modifier
                        .size(80.dp)
                        .padding(8.dp),
                    Alignment.Center
                )
                Column(
                    Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Welcome")

                    Text(text = "Manh Le", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .padding(20.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(painter = painterResource(id = R.drawable.bell), contentDescription ="" ,
                    modifier = Modifier.size(30.dp)
                        .clickable {  }
                )

                Icon(painter = painterResource(id = R.drawable.heart), contentDescription ="",
                    modifier = Modifier.size(30.dp)
                        .clickable {  }
                )
            }
        }

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = Color.LightGray,
                unfocusedContainerColor = Color.LightGray
            ),
            placeholder = { Text("Search", fontSize = 12.sp) },
            leadingIcon = { Icon(Icons.Filled.Search, contentDescription = "Search")
            }
        )

        Spacer(modifier = Modifier.height(20.dp))



        Row {
            Text(text = "Categories", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(3f)
            )

            Text(text = "See all", fontSize = 16.sp, color = Color(0xE26FAD72),
                modifier = Modifier
                    .weight(0.5f)
                    .clickable { }
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color(0xFFF9F9FF)),
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                ,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }

                Column(
                    modifier = Modifier.width(60.dp)
                ){
                    Image(painter = painterResource(id = R.drawable.pizza),
                        contentDescription = "",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(40.dp)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Vetgetable",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable { }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(text = "Discount guaranteed", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(3f)
            )

            Text(text = "See all", fontSize = 16.sp, color = Color(0xE26FAD72),
                modifier = Modifier
                    .weight(0.5f)
                    .clickable { }
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        LazyRow(modifier = Modifier.background(Color(0xFFF9F9FF))){
            items(10) {
                Food(name = "Pizza", star = "4.3", price = "100")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(text = "Recommended For You", fontSize = 20.sp, fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .weight(3f)
            )

            Text(text = "See all", fontSize = 16.sp, color = Color(0xE26FAD72),
                modifier = Modifier
                    .weight(0.5f)
                    .clickable { }
            )
        }

        Spacer(modifier = Modifier.height(10.dp))



    }
}

@Composable
fun Food(name :String,star :String,price :String) {
    Column(
        modifier = Modifier
            .width(150.dp)
            .padding(8.dp)
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.pizza),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .clickable { }
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "$name",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable { }
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "$star",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable { }
            )
            Icon(
                Icons.Filled.Star,
                contentDescription = "",
                tint = colorGreenlight,
                modifier = Modifier
                    .size(15.dp)
                    .clickable { }
            )
        }
        Text(text = "$price.000đ",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable { }
        )

    }
}


@Composable
fun Food1(name :String,star :String,price :String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)

    ) {
        Image(painter = painterResource(id = R.drawable.pizza),
            contentDescription = "",
            modifier = Modifier
                .size(100.dp)
                .clickable { }

        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = "$name",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable { }
            )

            Spacer(modifier = Modifier.height(5.dp))

            Row (
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "$star",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .clickable { }
                )
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "",
                    tint = Color.Red,
                    modifier = Modifier
                        .size(15.dp)
                        .clickable { }
                )

                Text(text = "(1.2k)")
            }

            Spacer(modifier = Modifier.height(5.dp))

            Text(text = "$price.000đ",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable { }
            )
        }

    }
}




@Preview
@Composable
fun MenuPreview(backgroundColorSpan: BackgroundColorSpan? = null) {
    Surface {
        Menu()
    }

}

