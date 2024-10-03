package  screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import components.RightContent
import components.Sidebar

@Composable
fun RadioCopilotUI() {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF101820))) {
        Row(modifier = Modifier.fillMaxSize().padding(15.dp)) {
            Sidebar()

            RightContent()
        }
    }
}
