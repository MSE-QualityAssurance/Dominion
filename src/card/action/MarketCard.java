public class MarketCard extends ActionCard {
    public MarketCard() {
        super("Market", 5); // Name and cost
    }

    @Override
    public void play(Player player, Game game) {
        player.drawCards(1); // Draw 1 card
        player.addActions(1); // Add 1 action
        player.addBuys(1);    // Add 1 buy
        player.addCoins(1);   // Add 1 coin
    }
}
