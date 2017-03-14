import javafx.scene.Parent
import tornadofx.View
import tornadofx.hbox
import tornadofx.label

class Main : View(){
    override val root = hbox {
        label("Hello world")
    }
}