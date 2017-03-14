abstract class ServiciosDecorator (private val servicios : Servicios) : Servicios by servicios {
    protected abstract val COST : Double
    protected abstract val NAME : String

    override fun calculateCost(): Double = servicios.calculateCost() + this.COST
    override fun returnString() : String = servicios.returnString() + this.NAME
}