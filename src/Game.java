// Game.java

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Deck deck;

    public Game() {
        players = new ArrayList<>();
        deck = new Deck();
    }

    public void start() {
        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            for (Player player : players) {
                player.drawCard(deck);
            }
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
