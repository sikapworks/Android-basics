package com.example.firstcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstcompose.ui.theme.FirstComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            TextInput()
//            ListViewItem()
        }
    }
}

@Composable
@Preview(showBackground = true, widthDp = 300, heightDp = 500)
private fun PreviewFunction() {

        Column {
            ListViewItem(R.drawable.johndoe, "John Doe", "Software Developer")
            ListViewItem(R.drawable.johndoe, "John Doe", "Technical Head")
            ListViewItem(R.drawable.johndoe, "John Doe", "Lead Engineer")
            ListViewItem(R.drawable.johndoe, "John Doe", "Software Developer 2")
            ListViewItem(R.drawable.johndoe, "John Doe", "Software Engineer")
        }
//    Box(contentAlignment = Alignment.BottomEnd) {
//        Image(
//            painter = painterResource(R.drawable.download),
//            contentDescription = null
//        )
//        Image(
//            painter = painterResource(R.drawable.android),
//            contentDescription = null
//        )
//
//    }

//--------------------------------------------------------------------

//    Row(
//        horizontalArrangement = Arrangement.SpaceEvenly,
//        verticalAlignment = Alignment.CenterVertically
//
//    ) {
//        Text(
//            text = "A",
//            fontSize = 24.sp
//        )
//        Text(
//            text = "B",
//            fontSize = 24.sp
//        )
//    }

//--------------------------------------------------------------------

//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "A",
//            fontSize = 24.sp
//        )
//        Text(
//            text = "B",
//            fontSize = 24.sp
//        )
//    }

//--------------------------------------------------------------------

//    TextField(
//        value = "hello cheezyCode",
//        onValueChange = {}, // this method is called when there is any change in the text field
//        label = {
//            Text(
//                text = "Enter Meassage",
//            )
//        },
//        placeholder = {}
//    )

//--------------------------------------------------------------------

//    Button(
//        onClick = { },
//        colors = ButtonDefaults.buttonColors(
//            contentColor = Color.Yellow,
//            containerColor = Color.Black
//    )) {
//        Text(
//            text = "hello"
//        )
//        Image(
//            painter = painterResource(R.drawable.android),
//            contentDescription = "dummy",
//
//        )
//    }

//--------------------------------------------------------------------

//    Image(
//        painter = painterResource(R.drawable.download),
//        contentDescription = "dummy image",
//        colorFilter = ColorFilter.tint(Color.Red),
//        contentScale = ContentScale.Crop
//    )

//--------------------------------------------------------------------

//    Text(
//        text = "Hello CheezyCode",
//        fontStyle = FontStyle.Italic,
//        fontWeight = FontWeight.ExtraBold,
//        color = Color.Red,
//        fontSize = 30.sp,
//        textAlign = TextAlign.Right
//    )

}

@Composable
fun ListViewItem(imageid: Int, name: String, occupation: String) {
    //image id is int cuz in drawable all the images are of int type
    Row(Modifier.padding(8.dp)) {
        Image(
            painter = painterResource(id = imageid),
            contentDescription = null,
            Modifier.size(50.dp)
        )
        Column() {
            Text(
                text = name,
                fontWeight = FontWeight.Bold,

            )
            Text(
                text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp

            )
        }
    }
}


 @Composable
fun TextInput() {
    var state = remember{ mutableStateOf("")} //defined a state here

     // state is being rendered here
     TextField(
         value = state.value,
         onValueChange = {
             state.value = it},
//             Log.d("MYCHEEZY", it)}, // this method is called when there is any change in the text field
         label = {
             Text(
                 text = "Enter Meassage",
             )
         },
     )
}