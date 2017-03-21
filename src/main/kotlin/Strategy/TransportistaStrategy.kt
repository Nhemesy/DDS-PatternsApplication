package Strategy

import Envio

interface TransportistaStrategy {
    fun calculateCost(envio: Envio): Double
}