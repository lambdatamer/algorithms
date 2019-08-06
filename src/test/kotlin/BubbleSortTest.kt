import org.junit.Test

class BubbleSortTest : BaseSortingTest() {

    override fun sortAscending(array: IntArray) = array.bubbleSort()

    override fun sortDescending(array: IntArray) = array.bubbleSort(false)

}