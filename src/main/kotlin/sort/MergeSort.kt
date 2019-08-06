package sort

import VERBOSE

fun IntArray.mergeSort(): IntArray = clone().apply {
    val workArray = IntArray(size)

    fun merge(from: Int, pivot: Int, to: Int) {
        if (VERBOSE) println("(${slice(from until pivot).joinToString()}) + (${slice(pivot until to).joinToString()})")
        var l = from
        var r = pivot

        var i = from

        while (l < pivot && r < to) workArray[i++] = if (get(l) < get(r)) get(l++) else get(r++)
        while (l < pivot) workArray[i++] = get(l++)
        while (r < to) workArray[i++] = get(r++)

        workArray.copyInto(this, from, from, to)
        if (VERBOSE) println(slice(from until to).joinToString(prefix = "(", postfix = ")"))
    }

    fun splitMerge(from: Int, to: Int) {
        if ((to - from) < 2) return

        val pivot = from + (to - from) / 2

        if (VERBOSE) println("(${slice(from until pivot).joinToString()}) - (${slice(pivot until to).joinToString()})")

        splitMerge(from, pivot)
        splitMerge(pivot, to)
        merge(from, pivot, to)
    }

    splitMerge(0, size)
}