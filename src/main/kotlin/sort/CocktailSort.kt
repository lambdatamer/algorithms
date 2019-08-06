package sort

import VERBOSE

/**
 * Cocktail sort
 * Time complexity
 * Best     Average     Worst
 * O(n)     O(n^2)      O(n^2)
 */
fun IntArray.cocktailSort() = clone().apply {

    if (isEmpty() || size == 1) return this

    var left = 0
    var right = size - 1

    do {
        if (VERBOSE) println("$left --> $right")
        var isSorted = true
        for (i in left until right) {
            val first = get(i)
            val second = get(i + 1)
            if (first > second) {
                swap(i, i + 1)
                isSorted = false
            }
        }
        if (isSorted) break
        --right

        if (VERBOSE) {
            println(joinToString())
            println("$left <-- $right")
        }

        isSorted = true
        for (i in right downTo left) {
            val first = get(i)
            val second = get(i + 1)
            if (first > second) {
                swap(i, i + 1)
                isSorted = false
            }
        }
        if (isSorted) break
        ++left

        if (VERBOSE) println(joinToString())
    } while (left < right)

}
