package Strategy

import Carta
import Envio
import Paquete

class SeurStrategy : TransportistaStrategy {
    override fun calculateCost(envio: Envio): Double {
        if (envio is Carta) {
            return 0.01 * envio.peso
        }
        if (envio is Paquete) {
            return 0.02 * envio.peso
        }
        if (envio is Paquete) {
            return 0.025 * envio.peso
        }
        return 0.0
    }
}