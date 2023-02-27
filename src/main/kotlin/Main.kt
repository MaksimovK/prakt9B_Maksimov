package AutoBaze

fun main(){
    val driverStepa = Driver("o000oo",5)
    driverStepa.RepairRequest()
    driverStepa.suspensionFromWork()
    val flight = Flight(6)
    driverStepa.flightIsOver()
}