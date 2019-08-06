class CocktailSortTest : BaseSortingTest() {

    override fun sortAscending(array: IntArray) = array.cocktailSort()

    override fun sortDescending(array: IntArray) = array.cocktailSort(false)

}