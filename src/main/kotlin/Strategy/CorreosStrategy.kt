package Strategy

import Carta
import Envio
import Paquete

class CorreosStrategy: TransportistaStrategy {
    override fun calculateCost(envio: Envio): Double {
        if (envio is Carta) {
            return 0.015 * envio.peso
        }
        if (envio is Paquete) {
            return 0.03 * envio.peso
        }
        if (envio is Paquete) {
            return 0.035 * envio.peso
        }
        return 0.0
    }
}