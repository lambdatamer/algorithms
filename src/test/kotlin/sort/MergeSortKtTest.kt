package sort

internal class MergeSortKtTest : BaseSortingTest() {
    override val name = "Merge"

    override fun sort(array: IntArray) = array.mergeSort()
}