/**
 * Bubble sort
 * Time complexity
 * Best     Average     Worst
 * O(n^2)     O(n^2)      O(n^2)
 */
internal class SelectionSortTest : BaseSortingTest() {
    override val name = "Selection"

    override fun sortAscending(array: IntArray) = array.selectionSort()

    override fun sortDescending(array: IntArray) = array.selectionSort(false)
}