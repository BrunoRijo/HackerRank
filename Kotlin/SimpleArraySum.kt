
import java.util.*

fun simpleArraySum(ar: Array<Int>) = ar.sum()

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = simpleArraySum(ar)

    println(result)
}

