public abstract class ActionCard extends Card {
    public ActionCard(String name, int cost) {
        super(name, cost);
    }

    @Override
    public abstract void play(Player player, Game game);
}