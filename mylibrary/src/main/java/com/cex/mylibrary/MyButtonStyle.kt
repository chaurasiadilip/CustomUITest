package com.cex.mylibrary

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data class MyButtonStyle(
    val backgroundColor: Color = Color.Blue,
    val contentColor: Color = Color.White,
    val cornerRadius: Dp = 8.dp, // optional if shape is provided
    val shape: Shape = RoundedCornerShape(8.dp),
    val elevation: Dp = 4.dp,
    val padding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
    val fontSize: TextUnit = 16.sp,
    val fontWeight: FontWeight = FontWeight.Medium,
    val border: BorderStroke? = null
)

