package sort

/**
 * Bubble sort
 * Time complexity
 * Best     Average     Worst
 * O(n^2)     O(n^2)      O(n^2)
 */
internal class SelectionSortTest : BaseSortingTest() {
    override val name = "Selection"

    override fun sort(array: IntArray) = array.selectionSort()
}