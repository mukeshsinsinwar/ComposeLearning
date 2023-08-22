package com.compose.ctekcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.ctekcompose.ui.theme.CtekComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewListItem()
        }
    }
}


/*@Preview(showBackground = true)
@Composable
fun CtekPreview() {
    Column() {
        ListViewItem(R.drawable.ic_cs_one_icon,"Cs1 Charger","Unavailable")
        ListViewItem(R.drawable.ic_cs_one_icon,"Cs1 Charger","Unavailable")
        ListViewItem(R.drawable.ic_cs_one_icon,"Cs1 Charger","Unavailable")
        ListViewItem(R.drawable.ic_cs_one_icon,"Cs1 Charger","Unavailable")
        ListViewItem(R.drawable.ic_cs_one_icon,"Cs1 Charger","Unavailable")
        ListViewItem(R.drawable.ic_cs_one_icon,"Cs1 Charger","Unavailable")

    }
}*/

/*
@Composable
fun ListViewItem(imgId : Int , name: String,status :String) {
    Row(Modifier.padding(4.dp)){
        Image(painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(60.dp)
        )
        Column {
            Text(text = name,
            fontWeight = FontWeight.Bold
            )
            Text(text = status,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
            )
        }
    }
}

@Composable
fun ListViewItem1(imgId : Int , name: String,status :String,modifier: Modifier) {
    Row(modifier.padding(4.dp)){
        Image(painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(60.dp)
        )
        Column {
            Text(text = name,
            fontWeight = FontWeight.Bold
            )
            Text(text = status,
            fontWeight = FontWeight.Thin,
            fontSize = 12.sp
            )
        }
    }
}

@Composable
fun circularImage(){
    Image(painter = painterResource(
        id = R.drawable.ic_cs_one_icon),
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(100.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Black, CircleShape),
        contentDescription = "")
}*/
