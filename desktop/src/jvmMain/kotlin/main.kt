import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.window.WindowDraggableArea
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    var undecorated by remember { mutableStateOf(true) }
    key(undecorated) {
        Window(
            onCloseRequest = ::exitApplication,
            state = rememberWindowState(width = Dp.Unspecified, height = Dp.Unspecified),
            undecorated = undecorated,
            resizable = true,
        ) {
            WindowDraggableArea {
                Box(Modifier.size(200.dp).background(Color.Yellow)) {
                    Button(onClick = { undecorated = !undecorated }) {
                        Text("undecorated=$undecorated")
                    }
                }
            }
        }
    }
}
