class Urgente : Servicios {
    private val COST : Double = 2.00
    private val NAME : String = "Envío urgente"

    override fun calculateCost(): Double = this.COST
    override fun returnString(): String = this.NAME
}
