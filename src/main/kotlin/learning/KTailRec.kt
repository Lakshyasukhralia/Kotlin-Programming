import java.math.BigInteger
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    val x = BigInteger.valueOf(100)
    val y = BigInteger.valueOf(200)

    val time = measureTimeMillis {
        fibonacci(100000,x,y)
    }
    print(time)
}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) b
    else fibonacci(n - 1, a + b, a)
}