/**
 * Created by livin on 29/5/17.
 */
class GameModel {
    val Deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles = arrayOf(
            FoundationPile("Clubs"),
            FoundationPile("Diamonds"),
            FoundationPile("Hearts"),
            FoundationPile("Spades")
    )
}