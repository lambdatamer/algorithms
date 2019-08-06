internal class InsertionSortTest : BaseSortingTest() {
    override val name: String = "Insertion"

    override fun sortAscending(array: IntArray) = array.insertionSort()

    override fun sortDescending(array: IntArray) = array.insertionSort(false)
}