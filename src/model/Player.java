import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> deck;
    private List<Card> hand;
    private List<Card> discardPile;

    public Player() {
        deck = new ArrayList<>();
        hand = new ArrayList<>();
        discardPile = new ArrayList<>();
        // Initialize with basic cards (7 Copper and 3 Estate)
        for (int i = 0; i < 7; i++) {
            deck.add(new Card("Copper", Card.Type.TREASURE, 0, 1));
        }
        for (int i = 0; i < 3; i++) {
            deck.add(new Card("Estate", Card.Type.VICTORY, 2, 0));
        }
        // Shuffle deck and draw initial hand
    }

    
    // Methods for drawing cards, playing cards, buying cards, etc.
}
