import kotlin.random.Random

const val DEBUG = true

fun main() {
    val size = 10
    val array = IntArray(size) { Random.nextInt(0, 100) }
    val customSort = array.bubbleSort()
    array.sort()
    array.toList()
    check(array.contentEquals(customSort))
}

