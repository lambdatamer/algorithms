package sort

import VERBOSE
import org.junit.AfterClass
import org.junit.Before
import org.junit.Test
import kotlin.random.Random
import kotlin.system.measureNanoTime

abstract class BaseSortingTest {

    companion object {
        private const val SIZE = 10000
        private val estimates = mutableMapOf<String, Triple<Long, Long, Long>>()

        @AfterClass
        @JvmStatic
        fun `Print estimates`() {
            println("\n\n${"Estimates for array[$SIZE]".padEnd(30)}(RANDOM, SORTED, REVERSE-SORTED)")
            estimates.forEach { (name, time) -> println("${name.padEnd(30)}$time μs") }
            println()
        }
    }

    abstract val name: String

    abstract fun sort(array: IntArray): IntArray

    private fun generateTestArray(size: Int = SIZE) = IntArray(size) { Random.nextInt(0, 100) }

    @Before
    fun `Set debug environment`() {
        VERBOSE = false
    }

    @Test
    fun `Sort ascending`() {
        println("\n$name")

        val array = generateTestArray()
        if (VERBOSE) println(array.joinToString() + '\n')

        val customSortedArray = sort(array)

        assert(customSortedArray.contentEquals(array.apply(IntArray::sort)))
    }

    @Test
    fun `Calculate estimates`() {
        VERBOSE = false
        val array = generateTestArray()
        estimates[name] = Triple(
            measureNanoTime { sort(array) }.also { array.sort() },
            measureNanoTime { sort(array) }.also { array.reverse() },
            measureNanoTime { sort(array) }
        )
    }

}