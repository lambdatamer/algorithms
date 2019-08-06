package sort

class BubbleSortTest : BaseSortingTest() {

    override val name = "Bubble"

    override fun sort(array: IntArray) = array.bubbleSort()

}