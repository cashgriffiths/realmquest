package Entities;

public abstract class Entity {
    private final String name;
    private double health;
    private double speed;

    public Entity(String name, double health, double speed) {
        this.name = name;
        this.health = health;
        this.speed = speed;
    }

    public void updateHealth(int hp) {
        health += hp;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    private double getSpeed() {
        return speed;
    }
}
