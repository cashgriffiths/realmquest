package Items;

public abstract class Item {
    private final String name;
    private final int maxStack;

    public Item(String name, int maxStack) {
        this.name = name;
        this.maxStack = maxStack;
    }

    public String getName() {
        return name;
    }

    public int getMaxStack() {
        return maxStack;
    }
}
