package com.example.goodhealth.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.goodhealth.ui.theme.newCyan
import com.example.goodhealth.R
import com.example.goodhealth.navigation.ROUT_ABOUT
import com.example.goodhealth.navigation.ROUT_DASHBOARD
import com.example.goodhealth.navigation.ROUT_DETAIL
import com.example.goodhealth.navigation.ROUT_SIGNUP
import com.example.goodhealth.ui.theme.newCyan
import com.example.goodhealth.ui.theme.newGreen


@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(newGreen),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_2) ,
            contentDescription = "home",
            modifier = Modifier
                .size(200.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(20.dp))


        Text(
            text = "WELCOME",
            fontSize = 25.sp,
            fontFamily = FontFamily.Serif,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(10.dp))
        
        Text(
            text = "Your Better Choice For better Health",
            fontSize = 20.sp


        )
        
        Spacer(modifier = Modifier.height(140.dp))


        Button(
            onClick = { navController.navigate(ROUT_DASHBOARD) },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Get started",
                fontSize = 20.sp)
        }

    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}
