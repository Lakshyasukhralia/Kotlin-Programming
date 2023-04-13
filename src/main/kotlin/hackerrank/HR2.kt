package hackerrank

import java.math.BigInteger

fun main() {
    minMaxSum(arrayOf(1, 2, 9, 5, 6))
//    minMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))
}

fun minMaxSum(arr: Array<Int>) {
    arr.sortDescending()
    val arr1 = arr.map { it.toLong() }

    val size = arr1.size

    var sum = 0L
    var min = 0L
    var max = 0L

    arr1.forEachIndexed { index, i ->
        sum += i
        if (index == size - 2) max = sum
        if (index == size - 1) min = sum - arr1[0]
    }
    print(min)
    print(" ")
    print(max)
}