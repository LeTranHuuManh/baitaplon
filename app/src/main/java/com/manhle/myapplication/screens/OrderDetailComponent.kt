package com.manhle.myapplication.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.orderfoodapp.ui.theme.colorGreenDark
import com.manhle.myapplication.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Order(){
    val tabItems = listOf(
        TabItems(
            id = 1,
            title = "Chờ xác nhận",

            ),
        TabItems(
            id = 2,
            title = "Đang giao",

            ),
        TabItems(
            id = 3,
            title = "Hoàn thành",

            ),
        TabItems(
            id = 4,
            title = "Đã hủy",

            ),
    )
    var selectedTabIndexOrder by remember {
        mutableStateOf(0)
    }
    val pagerStateOrder = rememberPagerState {
        tabItems.size
    }
    LaunchedEffect(selectedTabIndexOrder){
        pagerStateOrder.animateScrollToPage(selectedTabIndexOrder)
    }
    LaunchedEffect(pagerStateOrder.currentPage){
        selectedTabIndexOrder = pagerStateOrder.currentPage
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),

        ) {
        Row(
            modifier = Modifier.padding(
                horizontal = 16.dp, vertical = 8.dp
            ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Quản lý đơn đặt", style = MaterialTheme.typography.titleSmall)
        }
        TabRow(

            selectedTabIndex = selectedTabIndexOrder
        ) {
            tabItems.forEachIndexed { index, item ->
                Tab(
                    modifier = Modifier
                        .background(color = Color.White)
                        .height(63.dp),
                    selected = index == selectedTabIndexOrder,
                    onClick = { selectedTabIndexOrder = index },
                    text = {
                        Text(
                            text = item.title,
                            fontSize = 15.sp,
                            modifier = Modifier,
                            color = if (index == selectedTabIndexOrder) {
                                Color.Red
                            } else {
                                Color.Gray
                            }
                        )

                    },
                )
            }
        }
        HorizontalPager(
            state = pagerStateOrder,
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) { page ->

            Box(
                modifier = Modifier.fillMaxSize(),

                ) {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = tabItems[page].id.toString()
                ) {
                    composable(route = tabItems[page].id.toString()) {
                        when (tabItems[page].id) {
                            1 ->
                                Column {
                                    Column(

                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Row(

                                            verticalAlignment = Alignment.CenterVertically,

                                            modifier = Modifier.padding(12.dp),
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.anh1),
                                                contentDescription = "Food Image",
                                                contentScale = ContentScale.FillBounds,
                                                modifier = Modifier
                                                    .size(width = 100.dp, height = 90.dp)
                                                    .padding(end = 10.dp)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.White,
                                                        shape = RoundedCornerShape(15.dp)
                                                    )
                                                    .clip(RoundedCornerShape(15.dp))
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))
                                            Column(

                                                modifier = Modifier.weight(0.7f),
                                            ) {
                                                Text(
                                                    text = "Trà sữa",
                                                    color = Color.Black,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                                Text(
                                                    text = "Kí túc xá VKU",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                )
                                                Text(
                                                    text = "50,000đ",
                                                    color = Color.Red,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                            }


                                        }
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Row()
                                        {
                                            Button(
                                                onClick = {

                                                },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                modifier = Modifier

                                                    .border(
                                                        width = 2.dp,
                                                        color = Color.LightGray,
                                                        shape = RoundedCornerShape(30.dp)
                                                    )
                                                    .height(45.dp)
                                                    .padding(horizontal = 12.dp)
                                            ) {
                                                Text(
                                                    text = "Hủy đơn",
                                                    color = Color.Black
                                                )

                                            }
                                            Button(
                                                onClick = { /*TODO*/ },
                                                colors = ButtonDefaults.buttonColors(colorGreenDark),
                                                modifier = Modifier

                                                    .clip(RoundedCornerShape(30.dp))
                                                    .height(45.dp)
                                                    .padding(horizontal = 12.dp)
                                            ) {
                                                Text(
                                                    text = "Xem chi tiết",

                                                    )

                                            }
                                        }

                                        Spacer(modifier = Modifier.height(40.dp))

                                    }
                                    Column(

                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Row(

                                            verticalAlignment = Alignment.CenterVertically,

                                            modifier = Modifier.padding(12.dp),
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.anh1),
                                                contentDescription = "Food Image",
                                                contentScale = ContentScale.FillBounds,
                                                modifier = Modifier
                                                    .size(width = 100.dp, height = 90.dp)
                                                    .padding(end = 10.dp)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.White,
                                                        shape = RoundedCornerShape(15.dp)
                                                    )
                                                    .clip(RoundedCornerShape(15.dp))
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))
                                            Column(

                                                modifier = Modifier.weight(0.7f),
                                            ) {
                                                Text(
                                                    text = "Trà sữa",
                                                    color = Color.Black,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                                Text(
                                                    text = "Kí túc xá VKU",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                )
                                                Text(
                                                    text = "50,000đ",
                                                    color = Color.Red,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                            }


                                        }
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Row()
                                        {
                                            Button(
                                                onClick = {

                                                },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                modifier = Modifier

                                                    .border(
                                                        width = 2.dp,
                                                        color = Color.LightGray,
                                                        shape = RoundedCornerShape(30.dp)
                                                    )
                                                    .height(45.dp)
                                                    .padding(horizontal = 12.dp)
                                            ) {
                                                Text(
                                                    text = "Hủy đơn",
                                                    color = Color.Black
                                                )

                                            }
                                            Button(
                                                onClick = { /*TODO*/ },
                                                colors = ButtonDefaults.buttonColors(colorGreenDark),
                                                modifier = Modifier

                                                    .clip(RoundedCornerShape(30.dp))
                                                    .height(45.dp)
                                                    .padding(horizontal = 12.dp)
                                            ) {
                                                Text(
                                                    text = "Xem chi tiết",

                                                    )

                                            }
                                        }

                                        Spacer(modifier = Modifier.height(40.dp))

                                    }
                                    Column(

                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Row(

                                            verticalAlignment = Alignment.CenterVertically,

                                            modifier = Modifier.padding(12.dp),
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.anh1),
                                                contentDescription = "Food Image",
                                                contentScale = ContentScale.FillBounds,
                                                modifier = Modifier
                                                    .size(width = 100.dp, height = 90.dp)
                                                    .padding(end = 10.dp)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.White,
                                                        shape = RoundedCornerShape(15.dp)
                                                    )
                                                    .clip(RoundedCornerShape(15.dp))
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))
                                            Column(

                                                modifier = Modifier.weight(0.7f),
                                            ) {
                                                Text(
                                                    text = "Trà sữa",
                                                    color = Color.Black,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                                Text(
                                                    text = "Kí túc xá VKU",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                )
                                                Text(
                                                    text = "50,000đ",
                                                    color = Color.Red,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                            }


                                        }
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Row()
                                        {
                                            Button(
                                                onClick = {

                                                },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                modifier = Modifier

                                                    .border(
                                                        width = 2.dp,
                                                        color = Color.LightGray,
                                                        shape = RoundedCornerShape(30.dp)
                                                    )
                                                    .height(45.dp)
                                                    .padding(horizontal = 12.dp)
                                            ) {
                                                Text(
                                                    text = "Hủy đơn",
                                                    color = Color.Black
                                                )

                                            }
                                            Button(
                                                onClick = { /*TODO*/ },
                                                colors = ButtonDefaults.buttonColors(colorGreenDark),
                                                modifier = Modifier

                                                    .clip(RoundedCornerShape(30.dp))
                                                    .height(45.dp)
                                                    .padding(horizontal = 12.dp)
                                            ) {
                                                Text(
                                                    text = "Xem chi tiết",

                                                    )

                                            }
                                        }

                                        Spacer(modifier = Modifier.height(40.dp))

                                    }
                                }

                            2 ->

                                Column {
                                    Column(

                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Row(

                                            verticalAlignment = Alignment.CenterVertically,

                                            modifier = Modifier.padding(12.dp),
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.anh1),
                                                contentDescription = "Food Image",
                                                contentScale = ContentScale.FillBounds,
                                                modifier = Modifier
                                                    .size(
                                                        width = 100.dp,
                                                        height = 90.dp
                                                    )
                                                    .padding(end = 10.dp)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.White,
                                                        shape = RoundedCornerShape(15.dp)
                                                    )
                                                    .clip(RoundedCornerShape(15.dp))
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))
                                            Column(

                                                modifier = Modifier.weight(0.7f),
                                            ) {
                                                Text(
                                                    text = "Trà sữa",
                                                    color = Color.Black,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                                Text(
                                                    text = "Kí túc xá VKU",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                )
                                                Text(
                                                    text = "50,000đ",
                                                    color = Color.Red,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                            }

                                        }
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Button(
                                            onClick = { /*TODO*/ },
                                            colors = ButtonDefaults.buttonColors(Green),
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(30.dp))
                                                .height(45.dp)
                                                .padding(horizontal = 12.dp)
                                        ) {
                                            Text(
                                                text = "Xem chi tiết",

                                                )

                                        }
                                        Spacer(modifier = Modifier.height(40.dp))

                                    }
                                }

                            3 ->
                                Column {
                                    Column(

                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Row(

                                            verticalAlignment = Alignment.CenterVertically,

                                            modifier = Modifier.padding(12.dp),
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.anh1),
                                                contentDescription = "Food Image",
                                                contentScale = ContentScale.FillBounds,
                                                modifier = Modifier
                                                    .size(
                                                        width = 100.dp,
                                                        height = 90.dp
                                                    )
                                                    .padding(end = 10.dp)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.White,
                                                        shape = RoundedCornerShape(15.dp)
                                                    )
                                                    .clip(RoundedCornerShape(15.dp))
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))
                                            Column(

                                                modifier = Modifier.weight(0.7f),
                                            ) {
                                                Text(
                                                    text = "Trà sữa",
                                                    color = Color.Black,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                                Text(
                                                    text = "Kí túc xá VKU",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                )
                                                Text(
                                                    text = "50,000đ",
                                                    color = Color.Red,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                            }

                                            Spacer(modifier = Modifier.width(10.dp))
                                            Button(
                                                onClick = { /*TODO*/ },
                                                colors = ButtonDefaults.buttonColors(Color.White),
                                                modifier = Modifier
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.LightGray,
                                                        shape = RoundedCornerShape(10.dp)
                                                    )


                                            ) {
                                                Text(
                                                    text = "Trả đơn",
                                                    color = Color.Black,
                                                    fontSize = 13.sp
                                                )
                                            }

                                        }
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Button(
                                            onClick = { /*TODO*/ },
                                            colors = ButtonDefaults.buttonColors(Green),
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(30.dp))
                                                .height(45.dp)
                                                .padding(horizontal = 12.dp)
                                        ) {
                                            Text(
                                                text = "Xem chi tiết",

                                                )

                                        }
                                        Spacer(modifier = Modifier.height(40.dp))

                                    }
                                }

                            4 ->

                                Column {
                                    Column(
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {

                                        Row(

                                            verticalAlignment = Alignment.CenterVertically,

                                            modifier = Modifier.padding(12.dp),
                                        ) {
                                            Image(
                                                painter = painterResource(id = R.drawable.anh1),
                                                contentDescription = "Food Image",
                                                contentScale = ContentScale.FillBounds,
                                                modifier = Modifier
                                                    .size(
                                                        width = 100.dp,
                                                        height = 90.dp
                                                    )
                                                    .padding(end = 10.dp)
                                                    .border(
                                                        width = 1.dp,
                                                        color = Color.White,
                                                        shape = RoundedCornerShape(15.dp)
                                                    )
                                                    .clip(RoundedCornerShape(15.dp))
                                            )
                                            Spacer(modifier = Modifier.width(15.dp))
                                            Column(

                                                modifier = Modifier.weight(0.7f),
                                            ) {
                                                Text(
                                                    text = "Trà sữa",
                                                    color = Color.Black,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                                Text(
                                                    text = "Kí túc xá VKU",
                                                    color = Color.Black,
                                                    fontSize = 15.sp,
                                                )
                                                Text(
                                                    text = "50,000đ",
                                                    color = Color.Red,
                                                    fontSize = 22.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                                Spacer(modifier = Modifier.height(2.dp))
                                            }
                                        }
                                        Spacer(modifier = Modifier.height(10.dp))
                                        Button(
                                            onClick = {
                                            },
                                            colors = ButtonDefaults.buttonColors(Green),
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clip(RoundedCornerShape(30.dp))
                                                .height(45.dp)
                                                .padding(horizontal = 12.dp)

                                        ) {
                                            Text(
                                                text = "Mua lại",
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(40.dp))

                                    }
                                }
                        }


                    }


                }
            }
        }

    }
}

data class TabItems(
    val id: Int,
    val title: String,
)
@Preview
@Composable
fun Preview(){
    Surface() {
        Order()
    }
}