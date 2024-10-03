import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import screens.RadioCopilotUI

@Composable
@Preview
fun App() {

    MaterialTheme {
        RadioCopilotUI()
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = rememberWindowState(width = 1100.dp, height = 670.dp),
        resizable = false,
        title = "Radio Copilot",
        icon = painterResource("Logo.png")
    ) {
        App()
    }
}
