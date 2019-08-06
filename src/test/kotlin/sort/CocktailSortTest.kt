package sort

class CocktailSortTest : BaseSortingTest() {

    override val name = "Cocktail"

    override fun sort(array: IntArray) = array.cocktailSort()

}