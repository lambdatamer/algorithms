import org.junit.Test

class BubbleSortKtTest : BaseSortingTest() {

    override fun sortAscending(array: IntArray) = array.bubbleSort()

    override fun sortDescending(array: IntArray) = array.bubbleSort(false)

}