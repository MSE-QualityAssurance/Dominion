public class Card {
    public enum Type {
        TREASURE, VICTORY, ACTION
    }

    private String name;
    private Type type;
    private int cost;
    private int value; // Used for treasure cards

    public Card(String name, Type type, int cost, int value) {
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.value = value;
    }

    // Getters and setters
    public String getName() { return name; }
    public Type getType() { return type; }
    public int getCost() { return cost; }
    public int getValue() { return value; }
}
