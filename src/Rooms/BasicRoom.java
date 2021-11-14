package Rooms;

import Entities.Enemy;

import java.util.ArrayList;

public class BasicRoom extends Room {

    private ArrayList<Enemy> enemies;

    public BasicRoom(char c) {
        super(c);
    }

    @Override
    public void displayRoom() {

    }
}
