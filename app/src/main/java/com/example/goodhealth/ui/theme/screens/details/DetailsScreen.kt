package com.example.goodhealth.ui.theme.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.goodhealth.R
import com.example.goodhealth.navigation.VIEW_PRODUCTS_URL
import com.example.goodhealth.ui.theme.newGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DetailsScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())


    ) {



        TopAppBar(

            title = { Text(
                text = "Better Health Better You",
                fontFamily = FontFamily.Serif
            ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.White
                    )

                }
            },

            actions={
                IconButton(onClick = { /*TODO*/ }){

                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.White
                    )

                }
            }
        )
        Box (modifier = Modifier.height(200.dp), contentAlignment = Alignment.Center) {

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize()
            )
        }


        Spacer(modifier = Modifier.height(20.dp))

        //SEARCHBAR
        var search by remember { mutableStateOf("") }

        OutlinedTextField(
            value = search,
            onValueChange ={search= it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            placeholder = { Text(text = "Browse Products") }
        )

        //END OF SEARCHBAR


        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Health Products",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )


        //Row1
        Row(modifier = Modifier
            .padding(20.dp)
            .horizontalScroll(rememberScrollState())) {
            //CARD 1
            Row (modifier = Modifier.padding(20.dp)){

                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(150.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }


                Column (
                    modifier = Modifier.padding(10.dp)
                ){
                    Text(
                        text = "Omega 3 Salmon Oil ",
                        modifier = Modifier.padding(top = 50.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 4000 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Buy Product")

                    }







                }




            }

            Spacer(modifier = Modifier.width(10.dp))
            //card2
            Row (modifier = Modifier.padding(20.dp)){

                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(150.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Column (  modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start){

                    Text(
                        text = "6Kg mpishi gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 4500 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }




                }

            }

            Spacer(modifier = Modifier.width(40.dp))
            //card 3
            Row (modifier = Modifier.padding(20.dp)){
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Column (modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start){
                    Text(
                        text = "6Kg Kgas gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 4500 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }

                }





            }
            Spacer(modifier = Modifier.width(40.dp))
            // Card 4
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Column (modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start){
                    Text(
                        text = "6Kg total gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 4500 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }


                }






            }
            Spacer(modifier = Modifier.width(40.dp))
            // Card 5
            Row (modifier = Modifier.padding(20.dp)){
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Column (modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start){
                    Text(
                        text = "6Kg Afri gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 5000 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchae")

                    }



                }

            }

        }

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Skin Care",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )




        //Row2
        Row(modifier = Modifier
            .horizontalScroll(rememberScrollState())) {
            //CARD 1

            Row(modifier = Modifier.padding(20.dp)) {

                Card(
                    modifier = Modifier
                        .height(180.dp)
                        .width(160.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_8),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
                Spacer(modifier = Modifier.width(40.dp))
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Aloe Vera Gel",
                        modifier = Modifier.padding(top = 50.dp, end = 2.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 8000 ",
                        modifier = Modifier.padding(top = 10.dp, start = 2.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 30.dp, end = 30.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Buy Product")

                    }


                }
            }

            Spacer(modifier = Modifier.width(40.dp))
            //card2
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }

                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {

                    Text(
                        text = "13Kg pro gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 7000 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }

                }

            }
            Spacer(modifier = Modifier.width(40.dp))
            //card 3
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }



                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Sea gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 6500 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }

                }


            }
            Spacer(modifier = Modifier.width(40.dp))
            // Card 4
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }

                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "13Kg rubis gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 6500 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }


                }


            }

            Spacer(modifier = Modifier.width(40.dp))
            // Card 5
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(140.dp)
                        .width(160.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }


                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "13Kg mpishi gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 7000 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }


                }


            }
            Spacer(modifier = Modifier.width(40.dp))
            // Card 6
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }



                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "13Kg Afri gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 6000 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }


                }


            }
            Spacer(modifier = Modifier.width(40.dp))
            // Card 7
            Row(modifier = Modifier.padding(20.dp)) {
                Card(
                    modifier = Modifier
                        .height(160.dp)
                        .width(180.dp)
                ) {


                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                        Image(
                            painter = painterResource(id = R.drawable.img_7),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }
                }

                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "13Kg Safe gas ",
                        modifier = Modifier.padding(top = 90.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )

                    Text(
                        text = "ksh 6500 ",
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                        fontFamily = FontFamily.Serif
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    val mContext = LocalContext.current
                    //STK
                    Button(
                        onClick = {  val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) } },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 50.dp, end = 50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {

                        Text(text = "Purchase")

                    }



                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { navController.navigate(VIEW_PRODUCTS_URL) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(newGreen),
            shape = RoundedCornerShape(10.dp)
        ) {

            Text(text = "For inquiries")

        }
        Spacer(modifier = Modifier.height(90.dp))

    }



}



@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())


}