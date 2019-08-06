package sort

fun IntArray.swap(firstIndex: Int, secondIndex: Int) {
    if (firstIndex !in 0 until size || secondIndex !in 0 until size) {
        throw ArrayIndexOutOfBoundsException("first index: $firstIndex, second index: $secondIndex, array size: $size")
    }
    val tmp = this[firstIndex]
    this[firstIndex] = this[secondIndex]
    this[secondIndex] = tmp
}