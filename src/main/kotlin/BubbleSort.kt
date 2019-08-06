/**
 * Bubble sort
 * Time complexity
 * Best     Average     Worst
 * O(n)     O(n^2)      O(n^2)
 */
fun IntArray.bubbleSort(ascending: Boolean = true) = clone().apply {

    if (isEmpty() || size == 1) return this

    for (i in 0 until size) {
        var isSorted = true
        for (j in 0 until size - i - 1) {
            val left = get(j)
            val right = get(j + 1)
            if (left > right && ascending || left < right && !ascending) {
                swap(j, j + 1)
                isSorted = false
            }
        }
        if (DEBUG) println(joinToString())
        if (isSorted) break
    }

}