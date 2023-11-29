public class SmithyCard extends ActionCard {
    public SmithyCard() {
        super("Smithy", 4); // Name and cost
    }

    @Override
    public void play(Player player, Game game) {
        player.drawCards(3); // Player draws 3 cards
    }
}
