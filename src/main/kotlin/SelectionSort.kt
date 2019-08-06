/**
 * Selection sort
 * Time complexity
 * Best     Average     Worst
 * O(n^2)   O(n^2)      O(n^2)
 */
fun IntArray.selectionSort(ascending: Boolean = true) = clone().apply {

    if (isEmpty() || size == 1) return this

    for (i in 0 until size - 1) {
        var selection: Int = i
        for (j in i until size) {
            val selected = get(selection)
            val current = get(j)
            selection = if (selected > current && ascending || selected < current && !ascending) j else selection
        }
        if (selection != i) swap(selection, i)

        if (DEBUG) println(joinToString())
    }
}