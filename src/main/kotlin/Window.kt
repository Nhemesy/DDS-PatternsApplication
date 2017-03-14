import Styles.Companion.loginScreen
import javafx.animation.KeyFrame
import javafx.animation.Timeline
import javafx.event.EventHandler
import javafx.scene.control.CheckBox
import javafx.scene.control.PasswordField
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
        title = "Please log in"

        with (root) {
            addClass(loginScreen)

            row("Nombre") {
                nombre = textfield()
            }
            row("Direccion") {
                direccion = textfield()
            }
            row("Codigo postal") {
                codpostal= textfield()
            }
            row("Telefono") {
                telefono = textfield()
            }
            row("Direccion destino") {
                direcciondest = textfield()
            }
            row("Codigo postal destino") {
                codpostaldest= textfield()
            }
            row("Peso") {
                peso = textfield()
            }
            row {
                button("Enviar") {
                    isDefaultButton = true

                    //setOnAction {
                     //   loginController.tryLogin(
                     //           username.text,
                     //           password.text,
                     //           remember.isSelected
                     //   )
                    }
                }
            }

        }
    }


    fun shakeStage() {
        var x = 0
        var y = 0
        val cycleCount = 10
        val move = 10
        val keyframeDuration = Duration.seconds(0.04)

        val stage = FX.primaryStage

        val timelineX = Timeline(KeyFrame(keyframeDuration, EventHandler {
            if (x == 0) {
                stage.x = stage.x + move
                x = 1
            } else {
                stage.x = stage.x - move
                x = 0
            }
        }))

        timelineX.cycleCount = cycleCount
        timelineX.isAutoReverse = false

        val timelineY = Timeline(KeyFrame(keyframeDuration, EventHandler {
            if (y == 0) {
                stage.y = stage.y + move
                y = 1;
            } else {
                stage.y = stage.y - move
                y = 0;
            }
        }))

        timelineY.cycleCount = cycleCount;
        timelineY.isAutoReverse = false;

        timelineX.play()
        timelineY.play();
    }
