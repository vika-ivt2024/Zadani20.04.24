abstract class Shape {
    abstract fun calculateArea(): Double
}
fun printInventory (clazz: Class<milk>,clazz: Class<hleb>,clazz: Class<egg>: Unit) {

}
class totalInventoryValue (val stopimostEGG: Double,val stopimostHleb: Double,val stopimostMilk: Double) : Shape(){
    override fun calculateArea(): Double {
        return stopimostEGG + stopimostHleb + stopimostMilk
    }
}


fun main(args: Array<String>) {
    val tovar= printInventory(options)
    println("Информацию о всех товарах в магазине \n $tovar")
    println("Общую стоимость всех товаров на складе: {$calculateArea()} \n")

}