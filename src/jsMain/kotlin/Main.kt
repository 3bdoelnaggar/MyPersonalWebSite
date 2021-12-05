import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    var count: Int by mutableStateOf(0)
    val artcles = mapOf(
        "app name base on local" to
                "https://www.linkedin.com/pulse/what-you-want-change-app-name-based-build-type-support-elnaggar/?trackingId=%2FtdgfirxvbGiBCIF1H9zjQ%3D%3D",
        "gson with r8" to "https://dev.to/3bdoelnaggar/gson-and-r8-force-final-object-to-be-null-at-runtime-46l2",
        "build variant with google play services" to "https://3bdoelnaggar.medium.com/build-variant-with-google-play-services-c70c447775cb"
    )

    renderComposable(rootElementId = "root") {
        Div({ style { padding(25.px) } }) {
            LinkButton("Linked in", "https://www.linkedin.com/in/3bdoelnaggar/")
            LinkButton("Twitter", "https://twitter.com/3bdoelnaggar/")
            LinkButton("Githup", "https://github.com/3bdoelnaggar/")
            LinkButton("Play Store", "https://play.google.com/store/apps/developer?id=Abdalla+Elnaggar")
            Div({ style { paddingTop(20.px) } }) {
                Text("Articles")
            }
            artcles.forEach {
                Div {
                    A(it.value) {
                        Text(it.key)
                    }
                }
            }
        }
    }
}

@Composable
fun LinkButton(label: String, link: String) {
    Span({ style { padding(15.px) } }) {
        A(link) {

            Button(attrs = {
                onClick {
                }
            }) {
                Text(label)

            }
        }
    }
}

