package components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Sidebar() {
    var searchText by remember { mutableStateOf(TextFieldValue("")) }
    var searchAudioClipsController by remember { mutableStateOf("") }
    Card(
        backgroundColor = Color(0xFF272A31),
        modifier = Modifier.fillMaxHeight().width(250.dp).clip(RoundedCornerShape(8)),
        elevation = 0.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp)
        ) {
            Image(painter = painterResource("Logo.png"), contentDescription = "")
            OutlinedTextField(
                value = searchAudioClipsController,
                onValueChange = { searchAudioClipsController = it },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedLabelColor = Color.Black,
                    unfocusedLabelColor = Color.Transparent,
                    focusedBorderColor = Color.LightGray,
                    unfocusedBorderColor = Color.LightGray,
                    backgroundColor = Color.Transparent
                ),
                shape = RoundedCornerShape(30),
                modifier = Modifier.height(50.dp).fillMaxWidth().padding(bottom = 10.dp, top = 20.dp),
                placeholder = { Text("Search audio clips here") },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                }
            )
            Card(
                modifier = Modifier.fillMaxWidth().height(35.dp)
                    .clip(RoundedCornerShape(5.dp)),
                elevation = 0.dp,
                backgroundColor = Color(0xFF171A21)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row(
                        modifier = Modifier.fillMaxSize().padding(5.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Card(
                            backgroundColor = Color(0xFF272A31),
                            modifier = Modifier.height(20.dp).width(20.dp),
                            shape = CircleShape
                        ) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Icon(painter = painterResource("play-button-arrowhead.png"), contentDescription = "",
                                    modifier = Modifier.size(5.dp), tint = Color.White)
                            }
                        }
                        Text(
                            "Request: Jenna > Bruno Mars Lady Gaga",
                            color = Color.White,
                            fontSize = 10.sp
                        )
                        Icon(painter = painterResource("feather-share.png"), contentDescription = "",
                            tint = Color(0xFF3D83BB), modifier = Modifier.size(10.dp))
                    }
                }
            }

        }
    }
}