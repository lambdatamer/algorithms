import org.junit.AfterClass
import org.junit.Before
import org.junit.Test
import kotlin.random.Random
import kotlin.system.measureNanoTime

abstract class BaseSortingTest {

    companion object {
        private const val SIZE = 10
        private val estimates = mutableMapOf<String, Triple<Long, Long, Long>>()

        @AfterClass
        @JvmStatic
        fun `Print estimates`() {
            println("\n\n${"[Estimates]".padEnd(20)}(RANDOM, SORTED, REVERSE-SORTED)")
            estimates.forEach { (name, time) -> println("${name.padEnd(20)}$time μs") }
            println()
        }
    }

    abstract val name: String

    abstract fun sortAscending(array: IntArray): IntArray

    abstract fun sortDescending(array: IntArray): IntArray

    private fun generateTestArray(size: Int = SIZE) = IntArray(size) { Random.nextInt(0, 100) }

    @Before
    fun `Set debug environment`() {
        DEBUG = true
    }

    @Test
    fun `Sort ascending`() {
        println("\n$name ascending")

        val array = generateTestArray()
        if (DEBUG) println(array.joinToString() + '\n')

        val customSortedArray = sortAscending(array)

        assert(customSortedArray.contentEquals(array.apply(IntArray::sort)))
    }

    @Test
    fun `Sort descending`() {
        println("\n$name descending")

        val array = generateTestArray()
        if (DEBUG) println(array.joinToString() + '\n')

        val customSortedArray = sortDescending(array)

        assert(customSortedArray.contentEquals(array.apply(IntArray::sortDescending)))
    }

    @Test
    fun `Calculate estimates`() {
        DEBUG = false
        val array = generateTestArray()
        estimates[name] = Triple(
            measureNanoTime { sortAscending(array) }.also { array.sort() },
            measureNanoTime { sortAscending(array) }.also { array.reverse() },
            measureNanoTime { sortAscending(array) }
        )
    }

}