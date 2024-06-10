package model;

// Lớp này chịu trách nhiệm lưu trữ và truy xuất dữ lệu từ file gson (mình nghĩ thế)

// Lớp này chưa động đến

import java.util.ArrayList;
import java.util.List;

public class CardRepository {

    private List<Deck> decks;

    public CardRepository() {
        decks = new ArrayList<>();
    }

//    Add Deck
    public void addDeck(Deck deck) {
        decks.add(deck);
    }

//    Remove Deck
    public void removeDeck(Deck deck) {
        decks.remove(deck);
    }

//    Get Deck
    public Deck getDeck(int index) {
        return decks.get(index);
    }

//    Get All Decks
    public List<Deck> getAllDecks() {
        return decks;
    }
}
