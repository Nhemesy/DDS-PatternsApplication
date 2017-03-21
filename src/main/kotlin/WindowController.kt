import javafx.application.Platform
import tornadofx.Controller
import tornadofx.FX

class WindowController : Controller() {
    val loginScreen: Window by inject()
    val workbench: Workbench by inject()

    fun showLoginScreen(message: String, shake: Boolean = false) {
        if (FX.primaryStage.scene.root != loginScreen.root) {
            FX.primaryStage.scene.root = loginScreen.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }

        loginScreen.title = message
    }

    fun showWorkbench() {
        if (FX.primaryStage.scene.root != workbench.root) {
            FX.primaryStage.scene.root = workbench.root
            FX.primaryStage.sizeToScene()
            FX.primaryStage.centerOnScreen()
        }
    }

    fun send(cliente: Cliente,codpostal: String, envio: Envio) {

    }

    fun logout() {
        with (config) {
            remove(USERNAME)
            remove(PASSWORD)
            save()
        }

        showLoginScreen("Log in as another user")
    }

    companion object {
        val USERNAME = "username"
        val PASSWORD = "password"
    }
}