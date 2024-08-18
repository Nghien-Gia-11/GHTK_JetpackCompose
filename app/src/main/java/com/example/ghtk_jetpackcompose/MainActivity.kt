@file:OptIn(ExperimentalLayoutApi::class, ExperimentalLayoutApi::class)

package com.example.ghtk_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ghtk_jetpackcompose.ui.theme.GHTK_JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GHTK_JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
        ) {
            ImageBack()
            BoxCircle()
            Column(modifier = Modifier.padding(10.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp)
                ) {
                    Text(
                        fontWeight = FontWeight.Bold,
                        text = "843***4455",
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .padding(4.dp)
                    )
                    Following()
                }
                ConfirmAddress()
            }
        }
        SpaceRow()
        FlexBox()
        SpaceRow()
        Line()
        SpaceRow()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Item1("--", "Độ cháy túi")
            SpaceColumn()
            Item1("80", "ĐH đã đặt")
            SpaceColumn()
            Item1("--", "Thành công")
            SpaceColumn()
            Item1("Tên lửa", "Tốc độ nhận")
        }
        SpaceRow()
        Line()
        SpaceRow()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Item1("38    10    ", "Đánh giá")
            SpaceColumn()
            Item1("10 Shop", "Đã ghé thăm")
            SpaceColumn()
            Item1("11 Shop", "Đã mua")
            SpaceColumn()
            Item1("--", "Chu kỳ mua")
        }

        Spacer(
            modifier = Modifier
                .height(8.dp)
                .fillMaxWidth()
                .background(Color(221, 221, 231, 144))
        )
        Row(modifier = Modifier.height(35.dp)) {
            ViewPager("Hoạt động")
            ViewPager("Nhận hàng")
            ViewPager("2lanstore")
        }
        Row {
            val listItem = remember {
                listOf(
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm Giá trị cao", "10/10/2023"),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm thực phẩm khô", "10/10/2023"),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm thực phẩm tươi", "10/10/2023"),
                    ItemLazy("YEAHHH, phus đã đặt hàng sản phẩm 2023-09-20", "10/10/2023"),
                    ItemLazy(
                        "YEAHHH, phus đã đặt hàng sản phẩm Introduce local variable, fsdf",
                        "10/10/2023"
                    ),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm heli, 1", "10/10/2023"),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm heli, 1", "10/10/2023"),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm heli, 1", "10/10/2023"),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm heli, 1", "10/10/2023"),
                    ItemLazy("YEAHHH, hai đã đặt hàng sản phẩm heli, 1", "10/10/2023"),
                    ItemLazy("YEAHHH, phus đã đặt hàng sản phẩm 090", "10/10/2023"),
                    ItemLazy("YEAHHH, phus đã đặt hàng sản phẩm 090", "10/10/2023")
                )
            }
            LazyColumn(modifier = Modifier.weight(1f)) {
                items(listItem) { item ->
                    Item2(item.title, item.date)
                    Line()
                }
            }
            Column(modifier = Modifier.width(90.dp)) {
                Item3(R.drawable.telephone, "Gọi điện")
                Line()
                Item3(R.drawable.comment, "Chat")
                Line()
                Item3(R.drawable.plus, "Tạo ĐH")
                Line()
                Item3(R.drawable.star, "Đánh giá")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GHTK_JetpackComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun ViewPager(title : String){
    val color = if (title == "Hoạt động") Color(46, 112, 34, 255) else Color.Black
    Text(
        fontWeight = FontWeight.Bold,
        modifier = Modifier.fillMaxHeight().padding(top = 4.dp),
        text = title,
        color = color,
        fontSize = 18.sp,
        textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.width(10.dp).fillMaxHeight())
}

@Composable
fun Item2(title: String, date: String) {
    Row {
        Text(
            text = title,
            modifier = Modifier.width(200.dp),
        )
        Text(
            text = date,
            color = Color(121, 124, 121, 255)
        )
    }
}

@Composable
fun Item3(icon: Int, title: String) {
    Column(
        modifier = Modifier
            .background(Color(3, 148, 27, 255))
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = "",
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            color = Color.White,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 5.dp),
            fontSize = 19.sp
        )
    }
}

@Composable
fun Item1(title: String, detail: String) {
    val icon = if (title == "Tên lửa") R.drawable.shuttle else R.drawable.heart
    Column(modifier = Modifier.width(100.dp)) {
        Row() {
            Image(
                painter = painterResource(icon),
                contentDescription = "",
            )
            Text(
                fontWeight = FontWeight.Bold,
                text = title
            )
        }
        Text(
            text = detail
        )
    }
}

@Composable
fun BoxCircle() {
    Box {
        Canvas(
            modifier = Modifier
                .width(100.dp)
                .fillMaxSize()
        ) {
            drawCircle(
                color = Color(3, 148, 27, 255)
            )
        }
        Text(
            text = "55",
            fontStyle = androidx.compose.ui.text.font.FontStyle.Normal,
            color = Color.White,
            fontSize = 19.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun ImageBack() {
    Image(
        painter = painterResource(R.drawable.back),
        contentDescription = "Hello",
        modifier = Modifier
            .fillMaxHeight()
            .width(15.dp)
    )
}


@Composable
fun Following() {
    Row(
        modifier = Modifier
            .background(color = Color(3, 148, 27, 255))
            .fillMaxHeight()
    ) {
        Image(
            painter = painterResource(R.drawable.heart),
            contentDescription = "",
            modifier = Modifier
                .height(40.dp)
                .width(20.dp)
                .padding(3.dp)
        )
        Text(
            text = "Theo dõi",
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxHeight()
                .padding(3.dp)
        )
    }
}


@Composable
fun ConfirmAddress() {
    Row(
        modifier = Modifier
            .height(30.dp)
            .padding(4.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.tick),
            contentDescription = "",
            modifier = Modifier
                .width(15.dp)
                .fillMaxHeight()
        )
        Text(
            text = "Đã xác thực SĐT & Địa chỉ",
            modifier = Modifier.padding(start = 10.dp)
        )
    }
}


@Composable
@ExperimentalLayoutApi
fun FlexBox() {
    FlowRow(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(7.dp),
        verticalArrangement = Arrangement.spacedBy(7.dp)
    ) {
        TextFlexBox("Đã mua", Color(255, 255, 255))
        TextFlexBox("Thiết bị điện tử", Color(163, 174, 225, 255))
        TextFlexBox("Voucher", Color(227, 114, 114, 255))
        TextFlexBox("Thiết bị điện gia dụng", Color(39, 204, 74, 255))
        TextFlexBox("Mẹ và bé", Color(189, 86, 163, 255))
        TextFlexBox("Nhà cửa", Color(189, 170, 111, 255))
    }
}

@Composable
fun TextFlexBox(title: String, color: Color) {
    val backgroundColor = if (title == "Đã mua") Color.White else color
    val textColor = if (title == "Đã mua") Color(131, 130, 130, 255) else Color.White
    Text(
        text = title,
        color = textColor,
        modifier = Modifier
            .background(color = backgroundColor, shape = RoundedCornerShape(8.dp))
            .then(Modifier.padding(4.dp))
    )
}

@Composable
fun Line() {
    Spacer(
        modifier = Modifier
            .height(1.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
    )
}

@Composable
fun SpaceColumn() {
    Spacer(
        modifier = Modifier
            .height(20.dp)
            .width(1.5.dp)
            .background(Color.LightGray)
    )
}

@Composable
fun SpaceRow() {
    Spacer(
        modifier = Modifier
            .height(16.dp)
            .fillMaxWidth()
    )
}

class ItemLazy(
    val title: String,
    val date: String
)