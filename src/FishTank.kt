// C O R E    P R O G R A M //
fun main(args: Array<String>) {
    tankSize()
    addFish()
    currentFish()
}

//// F U N C T I O N S ////
fun tankSize(): Any {
    println("How many litres aquarium has?")
    val size = readLine()?.toIntOrNull() ?: 10
    if (hasDecorations()) {
        val newSize = size.times(0.8)
        return println("Aquarium with decorations has: $newSize litres capacity")
    } else {
        return println("Aquarium without decorations has $size litres capacity")
    }
}

fun hasDecorations(): Boolean {
    println("Does Aquarium has decorations? Press 1 for YES or 2 for NO")
    val decorations = readLine()?.toIntOrNull() ?: 1
    return if (decorations == 1) {
        println("Aquarium has decorations!")
        true
    } else if (decorations == 2) {
        println("Aquarium do not has decorations!")
        false
    } else {
        println("Aquarium has decorations!")
        true
    }
}

fun currentFish() {
    val fishInTank = mutableListOf<Int>(elements = *arrayOf(addFish()))
    val fishLength = fishInTank.sum()
    return println("There is ${fishInTank.count()} fish in aquarium, and their summarize length is $fishLength")
}

fun addFish(): Int {
    println("How long it is the fish that you want to add?")
    println("Type number: ")
    return readLine()?.toIntOrNull() ?: 0
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}


//fun tankSizemperature: Int = 20, dirty: Int = 20): Boolean {
//    return true
//}
//
//fun feedTheFish(){
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eat $food")
//}
//
//fun randomDay() : String {
//    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","saturday","Sunday")
//   return week[Random().nextInt(7)]
//}
//
//fun fishFood (day: String) :String {
//    return when (day) {
//        "Monday" -> "Flakes"
//        "Tuesday" -> "Red Worms"
//        "Wednesday" -> "White Worms"
//        "Thursday" -> "Pellets"
//        "Friday" -> "Planting"
//        else -> "fasting"
//
//
//    }
//    if (shouldChangeWater(day)){
//        println("Change the water today!")
//    }
//}