class Acuse : Servicios {
    private val COST : Double = 2.50
    private val NAME : String = "Envío con acuse de recibo."

    override fun calculateCost(): Double = this.COST
    override fun returnString(): String = this.NAME
}
