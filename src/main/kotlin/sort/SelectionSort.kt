package sort

import VERBOSE

/**
 * Selection sort
 * Time complexity
 * Best     Average     Worst
 * O(n^2)   O(n^2)      O(n^2)
 */
fun IntArray.selectionSort() = clone().apply {

    if (isEmpty() || size == 1) return this

    for (i in 0 until size - 1) {
        var selection: Int = i
        for (j in i until size) {
            val selected = get(selection)
            val current = get(j)
            selection = if (selected > current) j else selection
        }
        if (selection != i) swap(selection, i)

        if (VERBOSE) println(joinToString())
    }
}