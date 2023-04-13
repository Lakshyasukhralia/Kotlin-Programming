package learning

fun main() {

    badCode()
    goodCode()

}

fun badCode() {
    val myList: List<Any> = listOf(Motorcycle("red", "sport", "v8"), Bicycle("blue", "mountain"))

    for (item in myList) {
        when (item) {
            is Motorcycle -> {
                println(item.model)
            }
            is Bicycle -> {
                println(item.model)
            }
        }
    }
}

fun goodCode() {
    val myList: List<SimpleCycle<*>> = listOf(Motorcycle("red", "sport", "v8"), Bicycle("blue", "mountain"))

    for (item in myList) {
        println(item.modelType)
    }
}


//Bad class
//data class Motorcycle(val color: String, val model: String, val engine: String)
//data class Bicycle(val color: String, val model: String)
//data class Cycle(val motorcycle: Motorcycle, val bicycle: Bicycle)

//Good class
sealed class SimpleCycle<T>(val modelType: T)

data class Motorcycle(val color: String, val model: String, val engine: String) : SimpleCycle<String>(model)
data class Bicycle(val color: String, val model: String) : SimpleCycle<String>(model)
data class Cycle(val motorcycle: Motorcycle, val bicycle: Bicycle)


//Helpful link to understand diff bw * vs Any
//https://stackoverflow.com/questions/40138923/difference-between-and-any-in-kotlin-generics
