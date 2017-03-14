class Fragil : Servicios {
    private val COST : Double = 3.00
    private val NAME : String = "Envío frágil."

    override fun calculateCost(): Double = this.COST
    override fun returnString(): String = this.NAME
}
