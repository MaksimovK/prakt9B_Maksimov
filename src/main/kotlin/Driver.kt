package AutoBaze

open class Driver(val carNumber:String, var numberFlight: Int) {
    var suspension = true
    var repairRequest = true
    open fun RepairRequest(){
        if (repairRequest){
            println("Заявка на ремонт принята")
            repairRequest = false
        }
        else println("Заявка на ремонт уже создана")
    }
    fun flightIsOver() { println("Рейс был выполнен") }

    open fun suspensionFromWork(){
        suspension = false
    }
}