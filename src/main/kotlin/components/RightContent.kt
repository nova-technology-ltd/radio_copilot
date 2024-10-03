package components

import TopSection
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RightContent() {
    var audioNameController by remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf(0) } // Local state for RightContent

    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp)) {
        TopSection(selectedTab = selectedTab) { tab ->
            selectedTab = tab // Update local state when a tab is selected
        }
        // Conditionally display content based on the selected tab
        when (selectedTab) {
            0 -> VoiceTrackingSection()
            1 -> NewsWeatherTravelScreen()
            2 -> CallersScreen()
            else -> {
                // Default or fallback content
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .background(Color(0xFF2C2C2C)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Select a Tab",
                        color = Color.White,
                        fontSize = 20.sp
                    )
                }
            }
        }

    }
}
