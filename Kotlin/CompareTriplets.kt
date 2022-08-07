fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray())
    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
	var array = arrayOf(0,0)
	for (n in 0..a.size-1) if (a.get(n)!=b.get(n)) if (a.get(n)>b.get(n)) array[0]++ else array[1]++
    return array
}
