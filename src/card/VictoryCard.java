public class VictoryCard extends Card {
    private int points;

    public VictoryCard(String name, int cost, int points) {
        super(name, cost);
        this.points = points;
    }

    @Override
    public void play(Player player, Game game) {
        // Victory cards usually don't have an effect when played
    }

    public int getPoints() {
        return points;
    }
}
