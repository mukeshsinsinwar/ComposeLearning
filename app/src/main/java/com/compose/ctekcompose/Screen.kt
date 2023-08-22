package com.compose.ctekcompose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.ctekcompose.ui.theme.ColorPurple
import com.compose.ctekcompose.ui.theme.ColorWhite

@Preview
@Composable
fun PreviewListItem(){
  /*  Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getChargerList().map { item->
            ChargerList(imageId = item.image, name = item.name, status = item.status)

        }
    }*/
    LazyColumn(content = {
        items(getChargerList()){ item ->
            ChargerList(imageId = item.image, name = item.name, status = item.status)

        }
    })

    /*var  context  = LocalContext.current
    Button(onClick = {
        Toast.makeText(context,"Clicked",Toast.LENGTH_LONG).show()
    }) {

    }*/
}

/*
@Composable
fun ChargerList(imageId : Int, name:String,status:String){
    
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier.padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id =imageId),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .weight(.2f)

            )
            Column(modifier = Modifier.weight(.8f)) {
                Text(text = name,
                //fontWeight = FontWeight.Bold
                    //For consistence styling
                style = MaterialTheme.typography.bodyLarge
                )
                Text(text = status,
                fontWeight = FontWeight.Thin,
                    style =MaterialTheme.typography.bodySmall ,
                fontSize = 12.sp
                )
            }
        }

    }

}*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChargerList(imageId : Int, name:String,status:String){

    val  context  = LocalContext.current

    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = ColorPurple
        ),
        modifier = Modifier.padding(4.dp),
        onClick = {

            Toast.makeText(context,"Clicked event ",Toast.LENGTH_LONG).show()
        }


    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)) {
            Image(
                painter = painterResource(id =imageId),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)
                    .padding(8.dp)
                    .weight(.2f)

            )
            ChargerDescription(name, status, Modifier.weight(.8f))
        }

    }

}

@Composable
private fun ChargerDescription(name: String, status: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = name,
            //fontWeight = FontWeight.Bold
            //For consistence styling
            color = ColorWhite,
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = status,
            color = ColorWhite,
            fontWeight = FontWeight.Thin,
            style = MaterialTheme.typography.bodySmall,
            fontSize = 12.sp
        )
    }
}

data class ChargerModel(val image:Int,val name:String,val status:String)

fun getChargerList() :MutableList<ChargerModel>{
    val list = mutableListOf<ChargerModel>()
    list.add(ChargerModel(R.drawable.ic_cs_one_icon,"CSONE ","CS1 charger is set of charger "))
    list.add(ChargerModel(R.drawable.va_njord_not_charging,"NJORD GO","NJORD GO charger is set of charger "))
    list.add(ChargerModel(R.drawable.load_balancer_new,"NANOGRID","NANOGRID   charger is set of charger "))
    list.add(ChargerModel(R.drawable.ic_cs_one_icon,"CSONE","CS1 charger is set of charger "))
    list.add(ChargerModel(R.drawable.va_njord_not_charging,"NJORD GO","NJORD GO charger is set of charger "))
    list.add(ChargerModel(R.drawable.load_balancer_new,"NANOGRID","NANOGRID   charger is set of charger "))
    list.add(ChargerModel(R.drawable.ic_cs_one_icon,"CSONE","CS1 charger is set of charger "))
    list.add(ChargerModel(R.drawable.va_njord_not_charging,"NJORD GO","NJORD GO charger is set of charger "))
    list.add(ChargerModel(R.drawable.load_balancer_new,"NANOGRID","NANOGRID   charger is set of charger "))

    return list
}
