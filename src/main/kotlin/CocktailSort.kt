import kotlin.system.measureNanoTime

fun IntArray.cocktailSort(ascending: Boolean = true) = clone().apply {

    if (isEmpty() || size == 1) return this

    println("Cocktail sort")
    println(joinToString())

    var left = 0
    var right = size - 1

    val time = measureNanoTime {

        do {
            if (DEBUG) println("$left --> $right")
            for (i in left until right) {
                val first = get(i)
                val second = get(i + 1)
                if (first > second && ascending || first < second && !ascending) swap(i, i + 1)
            }
            --right
            if (DEBUG) {
                println(joinToString())
                println("$left <-- $right")
            }
            for (i in right downTo left) {
                val first = get(i)
                val second = get(i + 1)
                if (first > second && ascending || first < second && !ascending) swap(i, i + 1)
            }
            ++left
            if (DEBUG) println(joinToString())
        } while (left < right)
    }

    println("Result:\n${joinToString()}")
    println("Estimated time: $time μs")
}
