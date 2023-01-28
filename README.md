**Desktop**
- `./gradlew run` - run application

```Kotlin
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
```

### With undecorated = false
![img.png](img.png)

### With undecorated = true

![img_1.png](img_1.png)