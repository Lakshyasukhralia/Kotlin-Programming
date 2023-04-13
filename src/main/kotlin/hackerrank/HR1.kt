package hackerrank

fun main() {
//    val input = readLine()?.split(" ")?.map { it.toInt() }?.toTypedArray()
//    hackerrank.plusMinus(input!!)
    plusMinus(arrayOf(1, 1, 1, 0, -1, -1))
}

fun plusMinus(arr: Array<Int>) {

    val size = arr.size.toFloat()

    val pos = arr.filter { it > 0 }
    val neg = arr.filter { it < 0 }
    val zero = arr.filter { it == 0 }

    println(pos.size / size)
    println(neg.size / size)
    println(zero.size / size)
}