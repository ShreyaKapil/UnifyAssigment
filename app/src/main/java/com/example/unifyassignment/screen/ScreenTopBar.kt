package com.example.unifyassignment

import android.widget.Space
import android.widget.TextView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
 import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun generateTopBar(){
    TopAppBar(
        title = {
            Text(text = "Mandate Details",
                color = Color.Black,
                fontSize = 14.sp)
        },
        navigationIcon = {
         /* IconButton(onClick = { }) {
                Icon(painter = painterResource(id = R.drawable.back),
                    contentDescription = " ")
            }*/
        },
        backgroundColor = Color.Transparent,
        contentColor = Color.Gray,
        elevation = 2.dp
    )

}



@Preview
@Composable
fun callTheText(var1:String,var2:String){
    Row( modifier = Modifier.padding(vertical = 5.dp)) {
        Text(text =var1 , fontSize = 12.sp)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text=var2 , fontWeight = FontWeight.Bold)
    }
}
@Composable
fun createLine(){
    Spacer(
        Modifier
            .background(color = Color.LightGray)
            .height(1.dp)
            .fillMaxWidth())

}
@Composable
fun createSpacing(){
    Spacer(modifier = Modifier.height(10.dp))
}
 @Composable
fun genrateCardView(){
    Card (shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,){
        Column( modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start) {

         Row(  modifier = Modifier
             .fillMaxWidth()
             .padding(8.dp)
             .fillMaxWidth(),
             verticalAlignment = Alignment.CenterVertically) {
             callTheText("Valid Till","28-Jul")
             Spacer(modifier = Modifier.weight(1f))
             callTheText(var1 = "Upto Amount", var2 ="UFGX" ) }
            createLine()
              createSpacing()
            callTheText(var1 = "Frequency", var2 ="-As Presented" )
            createLine()
            createSpacing()
           Box(modifier = Modifier
               .padding(vertical = 10.dp)
               .background(color = Color.Yellow)
               .fillMaxWidth()){
               Text(text ="Teh amount will be bloacked when ride is booked with safe" +
                       "bada. Subject to above mention,limit and validity. ")
           }

        }
        }
    }
