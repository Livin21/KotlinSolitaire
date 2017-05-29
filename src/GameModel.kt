/**
 * Created by livin on 29/5/17.
 */
class GameModel {
    val Deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(
            FoundationPile(clubs),
            FoundationPile(diamonds),
            FoundationPile(hearts),
            FoundationPile(spades)
    )
    val tableauPiles = Array(7, { TableauPile() })
}