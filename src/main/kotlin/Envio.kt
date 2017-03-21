interface Envio {
    val destino: String
    val codPostal: Int
    val peso: Double
}

abstract class Carta(override val peso: Double) : Envio
abstract class Paquete(override val peso: Double) : Envio
abstract class GranEnvio(override val peso: Double) : Envio


class EnvioFactory{

}