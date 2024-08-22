package com.example.goodhealth.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.goodhealth.R
import com.example.goodhealth.navigation.ADD_PRODUCTS_URL
import com.example.goodhealth.navigation.ROUT_ABOUT
import com.example.goodhealth.navigation.ROUT_HOME
import com.example.goodhealth.navigation.ROUT_LOGIN
import com.example.goodhealth.navigation.ROUT_PRODUCTS
import com.example.goodhealth.navigation.ROUT_SIGNUP
import com.example.goodhealth.ui.theme.newBlue
import com.example.goodhealth.ui.theme.newCyan
import com.example.goodhealth.ui.theme.newGreen

@Composable
fun DashboardScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "GOOD HEALTH",
            fontSize = 40.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Your Better Choice for Better Health",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(20.dp))

        Column {
            //Start of card
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp),
                colors = CardDefaults.cardColors(newGreen)

            ) {

                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(200.dp)
                            .clickable {
                                navController.navigate(ROUT_HOME)

                            },
                        elevation = CardDefaults.cardElevation(10.dp)


                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_1),
                                    contentDescription = "Home",
                                    modifier = Modifier.size(100.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Home",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                                )

                        }

                    }
                    //End of Card2
                    Spacer(modifier = Modifier.width(20.dp))




                    //Card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(200.dp)
                            .clickable {
                                navController.navigate(ADD_PRODUCTS_URL)
                            },
                        elevation = CardDefaults.cardElevation(10.dp)

                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_4),
                                    contentDescription = "Home",
                                    modifier = Modifier.size(100.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Products",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card2


                }
                //End of row1


                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(200.dp)
                            .clickable {
                                navController.navigate(ROUT_ABOUT)
                            },
                        elevation = CardDefaults.cardElevation(10.dp)

                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_2),
                                    contentDescription = "Home",
                                    modifier = Modifier.size(100.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "User Profile",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card2
                    Spacer(modifier = Modifier.width(20.dp))




                    //Card
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(200.dp)
                            .clickable {
                                navController.navigate(ROUT_PRODUCTS)
                            },
                        elevation = CardDefaults.cardElevation(10.dp)

                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = "Home",
                                    modifier = Modifier.size(100.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Contacts",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card2


                }
                //End of row1


                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card
                    Card(
                        modifier = Modifier
                            .width(400.dp)
                            .height(200.dp)
                            .clickable {
                                navController.navigate(ROUT_PRODUCTS)
                            },
                        elevation = CardDefaults.cardElevation(10.dp)

                    ) {
                        Column {
                            Spacer(modifier = Modifier.height(10.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.img_6),
                                    contentDescription = "Home",
                                    modifier = Modifier.size(100.dp)
                                )


                            }
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Customer Insights",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center

                            )

                        }

                    }
                    //End of Card2



                }
                //End of row1

            }
            //End of Card


        }


    }
}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}