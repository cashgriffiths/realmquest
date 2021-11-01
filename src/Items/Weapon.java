package Items;

public class Weapon extends Item implements Loot{

    private int cooldown;
    private int max_cooldown;
    private double damage;
    private int weight;
    private double speed;

    public Weapon(String name) {
        super(name, 1);
    }


    @Override
    public void update() {
        cooldown--;
    }
}
