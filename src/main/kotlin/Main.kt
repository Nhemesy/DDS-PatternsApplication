import javafx.application.Application
import javafx.stage.Stage
import tornadofx.App
import tornadofx.InternalWindow
import tornadofx.importStylesheet

class Main : App(Window::class) {
    val loginController: WindowController by inject()

    override fun start(stage: Stage) {
        importStylesheet(InternalWindow.Styles::class)
        super.start(stage)
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}