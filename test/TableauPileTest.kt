import org.junit.Test

import org.junit.Assert.*

/**
 * Created by livin on 29/5/17.
 */
class TableauPileTest {
    @Test
    fun addCards() {

        //arrays
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, hearts))


        //act
        tableauPile.addCards(cards)


        //assert
        assertEquals(2, tableauPile.cards.size)
    }

    @Test
    fun removeCards() {
        // arrays
        val tableauPile = TableauPile(mutableListOf(Card(4, clubs),Card(3, diamonds),Card(2, spades)))


        // act
        tableauPile.removeCards(1)

        // assert
        assertEquals(mutableListOf(Card(4, clubs, true)), tableauPile.cards)
    }

}