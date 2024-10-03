package components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VoiceTrackingSection() {
    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
//        TopSection()
        Spacer(modifier = Modifier.height(15.dp))
        StyleSelector()
        Spacer(modifier = Modifier.height(16.dp))
        // Text input area
        var textState by remember { mutableStateOf(TextFieldValue("")) }
        Column {
            Text(
                text = "Text",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            OutlinedTextField(
                value = textState,
                onValueChange = { textState = it },
                label = { Text("Enter your text here") },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .background(
                        Color(0xFF1D1D1D),
                        shape = RoundedCornerShape(8.dp)
                    ),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    textColor = Color.White,
                    backgroundColor = Color(0xFF1D1D1D),
                    focusedBorderColor = Color.Red,
                    unfocusedBorderColor = Color.Red,
                    focusedLabelColor = Color.Red,
                    unfocusedLabelColor = Color.Gray
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Card(
            modifier = Modifier.height(45.dp).fillMaxWidth().clickable { },
            border = BorderStroke(width = 1.dp, color = Color(0xFF306088)),
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.Transparent
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("CREATE AUDIO", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Audio waveform (this is just a placeholder for the waveform visualization)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .background(Color(0xFF1D1D1D))
        ) {
            Text(
                "Audio Waveform Here",
                color = Color.White,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Save and Export buttons
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Card(
                modifier = Modifier.height(45.dp).weight(1f).clickable { },
                border = BorderStroke(width = 1.dp, color = Color(0xFF306088)),
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color.Transparent
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Icon(
                            painter = painterResource("feather_log_in.png"),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text("SAVE AUDIO", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
                    }
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                modifier = Modifier.height(45.dp).weight(1f).clickable { },
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFF306088)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {

                        Icon(
                            painter = painterResource("feather_log_in.png"),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Text(
                            "EXPORT AUDIO", color = Color.White, fontWeight = FontWeight.Bold,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "File name:  ",
                color = Color.White,
                fontSize = 13.sp
            )
            Card(
                modifier = Modifier.height(35.dp).width(250.dp),
                shape = RoundedCornerShape(10.dp),
                backgroundColor = Color.Transparent,
                border = BorderStroke(width = 1.dp, color = Color.White)
            ) {
                Box(
                    modifier = Modifier.fillMaxSize().padding(horizontal = 10.dp),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        "Certain Things -> Khalid", style = TextStyle(
                            fontSize = 11.sp,
                            color = Color.White
                        )
                    )
                }
            }
        }
    }
}