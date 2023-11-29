public class VillageCard extends ActionCard {
    public VillageCard() {
        super("Village", 3); // Name and cost
    }

    @Override
    public void play(Player player, Game game) {
        player.drawCards(1); // Draw 1 card
        player.addActions(2); // Add 2 actions
    }
}
