package com.example.unifyassignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unifyassignment.screen.callRecylerView
import com.example.unifyassignment.ui.theme.UnifyAssignmentTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ImageLoading.getList()
         setContent {
            UnifyAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                        screen()
                }
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun screen(){
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(10.dp)
    ){
        generateTopBar()
        Spacer(modifier = Modifier
            .heightIn(10.dp)
            .fillMaxWidth())
        genrateCardView()
        createSpacing()
        Text(text="AutoPay Payment Options" ,
            fontWeight = FontWeight.Bold, modifier = Modifier.padding(16.dp))
        callRecylerView(ImageLoading.list)
    }

}
