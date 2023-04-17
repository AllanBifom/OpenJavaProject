// Player.java

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public void drawCard(Deck deck) {
        Card card = deck.draw();
        hand.add(card);
    }
}

