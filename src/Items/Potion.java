package Items;

public abstract class Potion extends Item implements Loot {


    public Potion(String name, int maxStack) {
        super(name, maxStack);
    }

    @Override
    public void update() {

    }
}
