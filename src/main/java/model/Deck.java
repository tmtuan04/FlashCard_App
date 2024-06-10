package model;

// Lớp này đại diện cho một bộ thẻ flashcard
// Nó chứa một danh sách các flashcard và các phương thức để thao tác với danh sách này

// Lớp này chưa động đến

import java.util.ArrayList;
import java.util.List;

public class Deck {

    private List<Card> flashcards;

    public Deck() {
        flashcards = new ArrayList<>();
    }

//    Add Card
    public void addCard(Card card) {
        flashcards.add(card);
    }
//    Remove Card - Đoạn này sẽ không dễ như thế này
    public void removeCard(Card card) {
        flashcards.remove(card);
    }

//    Get Card
    public Card getCard(int index) {
        return flashcards.get(index);
    }

//    Get Deck (All card)
    public List<Card> getAllCards() {
        return flashcards;
    }

}
