interface Envio {
    val peso: Double
}

class Carta(override val peso: Double) : Envio
class Paquete(override val peso: Double) : Envio
class GranEnvio(override val peso: Double) : Envio


class EnvioFactory{
    fun envioPorPeso(peso: Double): Envio? {
        if(peso < 101) return Carta(peso)
        else if (peso < 2001) return Paquete(peso)
        else if (peso > 2000) return GranEnvio(peso)
        else return null
    }
}