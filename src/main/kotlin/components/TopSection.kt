import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TopSection(selectedTab: Int, onTabSelected: (Int) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            ClickableText(
                text = AnnotatedString("VOICE TRACKING"),
                style = TextStyle(
                    fontSize = 11.sp,
                    color = Color.White,
                ),
                onClick = { onTabSelected(0) }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier.height(2.dp).width(80.dp),
                backgroundColor = if (selectedTab == 0) Color(0xFF306088) else Color.Transparent
            ) {}
        }
        Column {
            ClickableText(
                text = AnnotatedString("NEWS, WEATHER, TRAVEL"),
                style = TextStyle(
                    fontSize = 11.sp,
                    color = Color.White,
                ),
                onClick = { onTabSelected(1) }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier.height(2.dp).width(125.dp),
                backgroundColor = if (selectedTab == 1) Color(0xFF306088) else Color.Transparent
            ) {}
        }
        Column {
            ClickableText(
                text = AnnotatedString("CALLERS"),
                style = TextStyle(
                    fontSize = 11.sp,
                    color = Color.White,
                ),
                onClick = { onTabSelected(2) }
            )
            Spacer(modifier = Modifier.height(10.dp))
            Card(
                modifier = Modifier.height(2.dp).width(40.dp),
                backgroundColor = if (selectedTab == 2) Color(0xFF306088) else Color.Transparent
            ) {}
        }
        Spacer(modifier = Modifier.width(350.dp))
        Icon(
            painter = painterResource("feather-settings.png"),
            contentDescription = "settings",
            tint = Color.White.copy(0.3f),
            modifier = Modifier.size(18.dp).clickable { })

    }

}
