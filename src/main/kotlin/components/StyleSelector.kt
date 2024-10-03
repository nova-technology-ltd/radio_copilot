package components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StyleSelector() {
    var selectedStyle by remember { mutableStateOf("Energetic") }
    val options = listOf("Option 1", "Option 2", "Option 3", "Option 4")
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf(options[0]) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Style  ",
            style = TextStyle(
                color = Color.White,
                fontSize = 13.sp
            )
        )
        Card(
            backgroundColor = if (selectedStyle == "Normal") Color(0xFF50D050) else Color(0xFF353535),
            modifier = Modifier.width(100.dp).height(32.dp).clip(RoundedCornerShape(0.dp)).clickable { selectedStyle = "Normal" },
            shape = RoundedCornerShape(bottomStart = 8.dp, topStart = 8.dp, bottomEnd = 0.dp, topEnd = 0.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter
            ) {
                Text("Normal", color = if (selectedStyle == "Normal") Color.Black else Color.White, fontSize = 10.sp)
            }
        }

        Card(
            backgroundColor = if (selectedStyle == "Energetic") Color(0xFF50D050) else Color(0xFF353535),
            modifier = Modifier.width(100.dp).height(32.dp).clip(RoundedCornerShape(0.dp)).clickable { selectedStyle = "Energetic"  },
            shape = RoundedCornerShape(0.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopCenter
            ) {
                Text("Energetic", color = if (selectedStyle == "Energetic") Color.Black else Color.White, fontSize = 10.sp)
            }
        }
        Card (
            backgroundColor = if (selectedStyle == "Calm") Color(0xFF50D050) else Color(0xFF353535),
            modifier = Modifier.width(100.dp).height(32.dp).clip(RoundedCornerShape(0.dp)).clickable { selectedStyle = "Calm"  },
            shape = RoundedCornerShape(bottomStart = 0.dp, topStart = 0.dp, bottomEnd = 8.dp, topEnd = 8.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.TopCenter
            ) {
                Text(
                    "Calm",
                    color = if (selectedStyle == "Calm") Color.Black else Color.White,
                    fontSize = 10.sp,
                    )
            }
        }
        Spacer(modifier = Modifier.width(220.dp))
        Box {
            Card(
                modifier = Modifier.width(250.dp).height(35.dp).clickable { expanded = true },
                border = BorderStroke(width = 0.5.dp, color = Color.White),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.Transparent
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(3.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = selectedOption, color = Color.White, fontSize = 11.sp)
                        Icon(imageVector = Icons.Default.List, contentDescription = null, tint = Color.White)
                    }
                }
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOption = option
                            expanded = false
                        }
                    ) {
                        Text(text = option)
                    }
                }
            }
        }
    }
}