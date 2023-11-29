public class TreasureCard extends Card {
    private int value;

    public TreasureCard(String name, int cost, int value) {
        super(name, cost);
        this.value = value;
    }

    @Override
    public void play(Player player, Game game) {
        player.addCoins(value);
    }

    public int getValue() {
        return value;
    }
}