import Styles.Companion.loginScreen
import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.event.EventHandler
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.util.Duration
import tornadofx.*

class Window : View() {
    override val root = GridPane()
    val loginController: WindowController by inject()

    var nombre: TextField by singleAssign()
    var direccion: TextField by singleAssign()
    var codpostal: TextField by singleAssign()
    var telefono: TextField by singleAssign()
    var direcciondest: TextField by singleAssign()
    var codpostaldest: TextField by singleAssign()
    var peso: TextField by singleAssign()

    init {
        title = "Envia tu mierda"

        with(root) {
            addClass(loginScreen)

            row("Nombre") {
                nombre = textfield()
            }
            row("Direccion") {
                direccion = textfield()
            }
            row("Codigo postal") {
                codpostal = textfield()
            }
            row("Telefono") {
                telefono = textfield()
            }
            row("Direccion destino") {
                direcciondest = textfield()
            }
            row("Codigo postal destino") {
                codpostaldest = textfield()
            }
            row("Peso") {
                peso = textfield()
            }
            row {
                button("Enviar") {
                    isDefaultButton = true
                    setOnAction{
                        loginController.send(Cliente(nombre.text, direccion.text, codpostal.text.toInt(),
                                telefono.text.toInt()), Envio(direcciondest.text, codpostaldest.text.toInt(), peso.text.toDouble()))
                    }
                }
            }
        }

    }
}
