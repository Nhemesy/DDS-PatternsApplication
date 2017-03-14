abstract class ServiciosDecorator (private val servicios : Servicios) : Servicios by servicios {
    protected abstract val COST : Double

    override fun calculateCost(): Double = servicios.calculateCost() + this.COST
}