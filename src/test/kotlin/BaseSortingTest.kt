import org.junit.Test
import kotlin.random.Random

abstract class BaseSortingTest {

    val size = 10

    abstract fun sortAscending(array: IntArray): IntArray

    abstract fun sortDescending(array: IntArray): IntArray

    fun generateTestArray(size: Int = this.size) = IntArray(size) { Random.nextInt(0, 100) }

    @Test
    fun `Bubble sort ascending`() {
        val array = generateTestArray()
        val customSortedArray = sortAscending(array)

        assert(customSortedArray.contentEquals(array.apply(IntArray::sort)))
    }

    @Test
    fun `Bubble sort descending`() {
        val array = generateTestArray()
        val customSortedArray = sortDescending(array)

        assert(customSortedArray.contentEquals(array.apply(IntArray::sortDescending)))
    }
}