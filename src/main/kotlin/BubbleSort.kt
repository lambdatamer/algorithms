import kotlin.system.measureNanoTime

fun IntArray.bubbleSort(ascending: Boolean = true) = clone().apply {

    if (isEmpty() || size == 1) return this

    println("Bubble sort")
    println(joinToString())

    val time = measureNanoTime {
        for (i in 0 until size) {
            for (j in 0 until size - i - 1 ) {
                val left = get(j)
                val right = get(j + 1)
                if (left > right && ascending || left < right && !ascending) swap(j, j + 1)
                if (DEBUG) println(joinToString())
            }
        }
    }

    println("Result:\n${joinToString()}")
    println("Estimated time: $time μs")
}