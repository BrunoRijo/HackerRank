import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var right = 0
    var left = 0
    var count1 = 0
    var count2 = arr.get(0).size-1
    while(count1 <= arr.get(0).size-1){
       right += arr.get(count1).get(count1) 
       left += arr.get(count1).get(count2) 
       count1++
       count2--
    }
    return Math.abs(right-left)
    
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}

