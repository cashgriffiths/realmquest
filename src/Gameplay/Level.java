package Gameplay;

import Rooms.Room;

import java.util.Random;

public class Level {
    private Room[][] grid;

    private static Level level = new Level();
    private static final Random r = new Random();

    // constants
    private static final float LOOT_ROOM_RATIO = 0.2F;

    private Level() {
        super();
    }

    public void initNewLevel() {
        level = new Level();
        int rows = r.nextInt() % 4 + 7;
        int cols = r.nextInt() % 4 + 7;
        grid = new Room[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
//                grid[i][j] = new Room(' ');
            }
        }
    }

    public static Level getLevel() {
        return level;
    }

    public Room getRoom(int y, int x) {
        return grid[y][x];
    }
}
