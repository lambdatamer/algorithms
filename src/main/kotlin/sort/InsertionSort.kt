package sort

import VERBOSE

/**
 * Selection sort
 * Time complexity
 * Best     Average     Worst
 * O(n)     O(n^2)      O(n^2)
 */
fun IntArray.insertionSort() = clone().apply {
    if (isEmpty() || size == 1) return this

    for (i in 1 until size) {
        val current = get(i)
        for (j in (i - 1) downTo 0) {
            val comparable = get(j)
            if (comparable > current) {
                swap(j, j + 1)
            } else {
                break
            }
        }
        if (VERBOSE) println(joinToString())
    }
}