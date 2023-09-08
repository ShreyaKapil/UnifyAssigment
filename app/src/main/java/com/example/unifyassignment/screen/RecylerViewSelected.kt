package com.example.unifyassignment.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.unifyassignment.createSpacing
import com.example.unifyassignment.data.ImageClass

@Preview(showBackground = true)
@Composable
fun generateTheList(){
    Card(shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,) {

        Row (modifier= Modifier
            .width(200.dp,)
            .height(200.dp)){
            Image(painter = rememberAsyncImagePainter("https://media.geeksforgeeks.org/wp-content/uploads/20210101144014/gfglogo.png"),
                contentDescription =" " )
            Spacer(modifier = Modifier.width(8.dp))
        } }


}
@Composable
fun callRecylerView(url:ArrayList<ImageClass>){
    LazyRow(  modifier = Modifier.fillMaxWidth()){
        url.map {
            item{
                 callItem(url = it.url)
            }
        }

    }

}
@Composable
fun callItem(url:String){
    Card(shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,) {
        Row(modifier= Modifier
            .width(200.dp,)
            .height(200.dp)) {
            Image(painter = rememberAsyncImagePainter(url),
                contentDescription =" " )
            Spacer(modifier = Modifier.width(8.dp))
        } }
}