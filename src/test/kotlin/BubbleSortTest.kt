class BubbleSortTest : BaseSortingTest() {

    override val name = "Bubble"

    override fun sortAscending(array: IntArray) = array.bubbleSort()

    override fun sortDescending(array: IntArray) = array.bubbleSort(false)

}