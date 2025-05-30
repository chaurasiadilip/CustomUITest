 package com.cex.customuitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cex.customuitest.ui.theme.CustomUITestTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment

import com.cex.mylibrary.MyButtonStyle
import com.cex.mylibrary.MyCustomButton
import androidx.compose.ui.text.font.FontWeight

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CustomUITestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                   MainScreen()
                }
            }
        }
    }
}




 @Composable
 fun MainScreen() {
     val styles = MyButtonStyle(
         backgroundColor = Color.Magenta,
         shape = CircleShape,
         padding = PaddingValues(12.dp),
         fontSize = 14.sp,
         fontWeight = FontWeight.SemiBold
     )

     Box(
         modifier = Modifier
             .fillMaxSize(),
         contentAlignment = Alignment.Center // ← centers the content
     ) {
         MyCustomButton(
             text = "Click Me",
             style = styles,
             onClick = {
                 // Handle click
             }
         )
     }
 }
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CustomUITestTheme {
        MainScreen()
    }
}