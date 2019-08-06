package sort

internal class InsertionSortTest : BaseSortingTest() {
    override val name: String = "Insertion"

    override fun sort(array: IntArray) = array.insertionSort()
}